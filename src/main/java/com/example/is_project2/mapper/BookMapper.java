package com.example.is_project2.mapper;

import com.example.is_project2.dto.BookDto;
import com.example.is_project2.dto.UserDto;
import com.example.is_project2.model.Book;
import com.example.is_project2.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@RequiredArgsConstructor
@Component
public class BookMapper {

    public BookDto bookEntityToDto(Book book){
        return BookDto.builder()
                .id(book.getId())
                .author(book.getAuthor())
                .title(book.getTitle())
                .quantity(book.getQuantity())
                .price(book.getPrice())
                .build();
    }

    public List<BookDto> bookListEntityToDto(List<Book> books){
        return books.stream()
                .map(book -> bookEntityToDto(book))
                .toList();
    }


    public Book bookDtoToEntity(BookDto bookDto){
        return Book.builder()
                .id(bookDto.id())
                .author(bookDto.author())
                .title(bookDto.title())
                .quantity(bookDto.quantity())
                .price(bookDto.price())
                .build();
    }

    public List<Book> bookListDtoToEntity(List<BookDto> bookDtos){
        return bookDtos.stream()
                .map(bookDto -> bookDtoToEntity(bookDto))
                .toList();
    }
}
