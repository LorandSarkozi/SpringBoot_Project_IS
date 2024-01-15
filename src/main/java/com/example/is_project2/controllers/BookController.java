package com.example.is_project2.controllers;

import com.example.is_project2.dto.BookDto;
import com.example.is_project2.dto.UserDto;
import com.example.is_project2.mapper.BookMapper;
import com.example.is_project2.model.Role;

import com.example.is_project2.model.Book;
import com.example.is_project2.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import com.example.is_project2.repository.BookRepository;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("books")
public class BookController {


    private final BookService bookService;

    @GetMapping()
    public String getBooks(Model model) {
        List<BookDto> bookDtos = bookService.getAllBooks();
        model.addAttribute("title", "Books");
        model.addAttribute("books", bookDtos);
        return "books/index";
    }

    @GetMapping("/{id}")
    public BookDto getBookById(@PathVariable Integer id){
        return bookService.getBookById(id);
    }

    @GetMapping("/create")
    public String displayCreateBookForm(Model model) {
        model.addAttribute("title", "Create Book");
        model.addAttribute(new Book());
        return "books/create";
    }
    @PostMapping("/create")
    public String processCreateBookForm(@ModelAttribute Book newBook, Errors errors, Model model){
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Book");
            //model.addAttribute(new Book());
            return "books/create";
        }
        bookService.save(newBook);
        return "redirect:/books";
    }

    @GetMapping("/delete")
    public String displayDeleteBookForm(Model model) {
        model.addAttribute("title", "Delete Books");
        model.addAttribute("books", bookService.getAllBooks());
        return "books/delete";
    }

    @PostMapping("/delete")
    public String processDeleteBooksForm(@RequestParam(required = false) Integer[] bookIds) {
        if (bookIds != null) {
            for (Integer id : bookIds) {
                bookService.deleteBookById(id);
            }
        }
        return "books/delete";
    }


}