package com.cassio.bookstoremanage.repository;

import com.cassio.bookstoremanage.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
