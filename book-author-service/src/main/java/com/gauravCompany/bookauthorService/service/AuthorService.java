package com.gauravCompany.bookauthorService.service;

import com.gauravCompany.bookauthorService.dto.AuthorDTO;

public interface AuthorService {
    Long register(AuthorDTO authorDTO);
    AuthorDTO getAuthorDetail(Long authorId);
}
