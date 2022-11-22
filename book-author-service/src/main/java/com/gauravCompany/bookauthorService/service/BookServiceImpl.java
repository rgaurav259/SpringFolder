package com.gauravCompany.bookauthorService.service;

import com.gauravCompany.bookauthorService.dto.BookDTO;
import com.gauravCompany.bookauthorService.entity.AuthorEntity;
import com.gauravCompany.bookauthorService.entity.BookEntity;
import com.gauravCompany.bookauthorService.repository.AuthorRepository;
import com.gauravCompany.bookauthorService.repository.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public Long addBook(Long authorId, BookDTO bookDTO) {

        Optional<AuthorEntity> authorEntityId = authorRepository.findById(authorId);

        if (authorEntityId.isPresent()){
            BookEntity bookEntity = new BookEntity();
            BeanUtils.copyProperties(bookDTO,bookEntity);
            bookEntity.setAuthor(authorEntityId.get());
            bookEntity = bookRepository.save(bookEntity);
            return bookEntity.getId();
        }
        //by dfault method beanutils in java that allows us to change the data source to target
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
