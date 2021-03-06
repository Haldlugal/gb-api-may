package ru.gb.gbapimay.security;

import lombok.*;

/**
 * @author Artem Kropotov
 * created at 01.06.2022
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginResponseBody {

    private String token;
}
