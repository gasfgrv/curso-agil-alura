package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.User;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.Email;

import static org.junit.jupiter.api.Assertions.*;

class UserFormMapperTest {

    private final String NAME = "Fulano";
    private final String EMAIL = "fulano@email.com";
    private final String PASSWORD = "123456";

    private UserFormMapper mapper;

    @Test
    void souldConvertUserFormToUser() {
        UserForm form = new UserForm(NAME, EMAIL, PASSWORD);
        mapper = new UserFormMapper();

        User user = mapper.map(form);

        assertEquals(NAME, user.getName());
        assertEquals(EMAIL, user.getEmail());
        assertEquals(PASSWORD, user.getPassword());
    }
}