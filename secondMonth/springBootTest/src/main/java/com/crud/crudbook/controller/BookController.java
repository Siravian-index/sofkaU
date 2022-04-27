package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Book;
import com.crud.crudbook.service.BookService;
import com.crud.crudbook.service.BookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return service.saveBook(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book){
        return service.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        service.deleteBook(id);
    }

}
