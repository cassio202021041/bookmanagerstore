package com.cassio.bookstoremanage.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false, unique = true)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer chapters;

    @Column(nullable = false)
    private  String isbn;

    @Column(name = "publisher_name", nullable = false, unique = true)
    private String publisherName;

    @ManyToOne(fetch =FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "autor_id" )
    private Autor autor;


}
