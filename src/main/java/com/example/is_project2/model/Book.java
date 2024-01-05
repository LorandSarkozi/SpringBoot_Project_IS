package com.example.is_project2.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Book extends AbstractEntity{


    @NotBlank(message = "Author is required!")
    @Size(min = 3, max = 50, message = "Author must be between 2 and 50 characters.")
    private String author;


    @NotBlank(message = "Title is required!")
    @Size(min = 5, max = 100, message = "Title must be between 5 and 100 characters.")
    private String title;

    @NotNull(message = "Quantity cannot be null")
    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;

    @NotNull(message = "Price cannot be null")
    @Min(value = 1, message = "Price must be at least 1")
    private double price;


    public Book(String author, String title, int quantity, double price) {
        this.author = author;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    public Book(){}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }


    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    @Override
    public String toString(){
        return String.format("Book author: %s | title: %s  | Quantity: %d | Price: %f", author, title,quantity,price);
    }
}