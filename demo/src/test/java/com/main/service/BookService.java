package com.main.service;

import com.main.model.Book;

import java.util.List;

public interface BookService {
    public Book saveBook(Book book);
    public List<Book> getAllBooks();
}
