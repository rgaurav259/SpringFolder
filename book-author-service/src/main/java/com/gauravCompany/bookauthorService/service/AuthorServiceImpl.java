package com.gauravCompany.bookauthorService.service;

import com.gauravCompany.bookauthorService.dto.AuthorDTO;
import com.gauravCompany.bookauthorService.entity.AuthorEntity;
import com.gauravCompany.bookauthorService.repository.AuthorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public Long register(AuthorDTO authorDTO) {
        AuthorEntity authorEntity = new AuthorEntity();
        BeanUtils.copyProperties(authorDTO,authorEntity);
        authorEntity = authorRepository.save(authorEntity);
        return authorEntity.getId();
    }

    @Override
    public AuthorDTO getAuthorDetail(Long authorId) {
        return null;
    }
}
