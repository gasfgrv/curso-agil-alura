package br.com.caelum.clines.api.users;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
public class UserForm {

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String password;

}
