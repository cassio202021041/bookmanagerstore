package com.cassio.bookstoremanage.service;

import com.cassio.bookstoremanage.dto.MessageResponseDTO;
import com.cassio.bookstoremanage.entity.Book;
import com.cassio.bookstoremanage.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with ID" + savedBook.getId()) /* "Criação de livros com ID" */
                .build();
    }
}
