package com.main.controller;

import com.main.model.Book;
import com.main.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/book")
@CrossOrigin
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public String add(@RequestBody Book book){
        bookService.saveBook(book);
        return "New book is added";
    }

    @GetMapping("/getAll")
    public List<Book> list(){
        return bookService.getAllBooks();
    }
}
