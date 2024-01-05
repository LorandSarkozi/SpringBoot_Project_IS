package com.example.is_project2.controllers;


import com.example.is_project2.model.Role;
import jakarta.validation.Valid;
import com.example.is_project2.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import com.example.is_project2.repository.book.BookRepository;


@Controller
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public String displayAllBooks(Model model){

            model.addAttribute("title", "All Books");
            model.addAttribute("books", bookRepository.findAll());
        return "books/index";
    }

    @GetMapping("create")
    public String displayCreateBookForm(Model model) {
        model.addAttribute("title", "Create Book");
        model.addAttribute(new Book());
        return "books/create";
    }
    @PostMapping("create")
    public String processCreateBookForm(@ModelAttribute @Valid Book newBook, Errors errors, Model model){
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Book");
            model.addAttribute(new Book());
            return "books/create";
        }
        bookRepository.save(newBook);
        return "redirect:/books";
    }


    @GetMapping("delete")
    public String displayDeleteBookForm(Model model){
        model.addAttribute("title","Delete Books");
        model.addAttribute("books",bookRepository.findAll());
        return "books/delete";
    }

    @PostMapping("delete")
    public String processDeleteBooksForm(@RequestParam(required = false) int[] bookIds){
        if(bookIds != null) {
            for (int id : bookIds) {
                bookRepository.deleteById(id);
            }
        }
        return "redirect:/books";
    }


}
