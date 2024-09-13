package com.furkant.issuemanagement.service;

import com.furkant.issuemanagement.dto.UserDto;
import com.furkant.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;


public interface UserService {

    UserDto save(UserDto user);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);
}
