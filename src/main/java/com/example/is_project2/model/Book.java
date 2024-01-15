package com.example.is_project2.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String author;



    private String title;


    private int quantity;


    private double price;


    public Book(String author, String title, int quantity, double price) {
        this.author = author;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

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