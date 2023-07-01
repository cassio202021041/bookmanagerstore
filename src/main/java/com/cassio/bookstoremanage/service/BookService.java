package com.cassio.bookstoremanage.service;

import com.cassio.bookstoremanage.dto.BookDTO;
import com.cassio.bookstoremanage.dto.MessageResponseDTO;
import com.cassio.bookstoremanage.entity.Book;
import com.cassio.bookstoremanage.mapper.BookMapper;
import com.cassio.bookstoremanage.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
         Book bookToSave = BookMapper.toModel(bookDTO);

         Book savedBook = bookRepository.save(bookToSave);
                  return MessageResponseDTO.builder()
                .message("Book created with ID" + savedBook.getId()) /* "Criação de livros com ID" */
                .build();
    }
}
