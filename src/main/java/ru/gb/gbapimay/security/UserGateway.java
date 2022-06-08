package ru.gb.gbapimay.security;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Artem Kropotov
 * created at 27.05.2022
 **/
public interface UserGateway {

    @PostMapping
    ResponseEntity<UserDto> handlePost(@Validated @RequestBody UserDto userDto);


}
