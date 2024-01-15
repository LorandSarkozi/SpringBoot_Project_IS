package com.example.is_project2.service;

import com.example.is_project2.dto.BookDto;
import com.example.is_project2.dto.UserDto;
import com.example.is_project2.model.Book;
import com.example.is_project2.model.RegistrationRequest;
import com.example.is_project2.model.User;

import java.util.List;

public interface BookService {

    public BookDto getBookById(Integer id);
    List<BookDto> getAllBooks();

    BookDto createBook(Book book);
    void save(Book book);

    BookDto updateBook(Book book);

    void deleteBook(Book book);

    void deleteBookById(Integer id);
}