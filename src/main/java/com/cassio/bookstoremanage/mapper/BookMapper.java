package com.cassio.bookstoremanage.mapper;

import com.cassio.bookstoremanage.dto.BookDTO;
import com.cassio.bookstoremanage.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}