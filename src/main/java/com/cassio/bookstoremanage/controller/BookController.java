package com.cassio.bookstoremanage.controller;


import com.cassio.bookstoremanage.dto.BookDTO;
import com.cassio.bookstoremanage.dto.MessageResponseDTO;
import com.cassio.bookstoremanage.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {  
        this.bookService = bookService;
    }


     @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) {
        return bookService.create(bookDTO);
    }
}
