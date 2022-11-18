package com.gauravCompany.bookauthorService.service;

import com.gauravCompany.bookauthorService.dto.BookDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    @Override
    public Long addBook(Long authorId, BookDTO bookDTO) {
        return null;
    }

    @Override
    public List<BookDTO> getAllBooks(Long authorId) {
        return null;
    }

    @Override
    public BookDTO updateBook(Long bookId, BookDTO bookDTO) {
        return null;
    }

    @Override
    public BookDTO updateBookPrice(Long bookId, Double newPrice) {
        return null;
    }

    @Override
    public void deleteBook(Long bookId) {

    }

    @Override
    public List<BookDTO> searchBooksByTitle(String title) {
        return null;
    }
}
