package com.example.is_project2.service;

import com.example.is_project2.dto.BookDto;
import com.example.is_project2.dto.UserDto;
import com.example.is_project2.mapper.BookMapper;
import com.example.is_project2.mapper.UserMapper;
import com.example.is_project2.model.Book;
import com.example.is_project2.model.User;
import com.example.is_project2.repository.BookRepository;
import com.example.is_project2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    public BookDto getBookById(Integer id){
        return bookMapper.bookEntityToDto(bookRepository.findById(id).orElse(null));
    }


    public List<BookDto> getAllBooks(){
        return bookMapper.bookListEntityToDto(bookRepository.findAll());
    }

    public BookDto createBook(Book book){
        book.setId(book.getId());
        return bookMapper.bookEntityToDto(bookRepository.save(book));
    }

    public BookDto updateBook(Book book){
        return bookMapper.bookEntityToDto(bookRepository.save(book));
    }

    public void deleteBook(Book book){
        bookRepository.delete(book);
    }
}
