package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserViewMapperTest {
    private final String NAME = "Fulano";
    private final String EMAIL = "fulano@email.com";
    private final String PASSWORD = "123456";

    private UserViewMapper mapper;

    @Test
    void shoudConvertUserToUserView() {
        User user = new User(NAME, EMAIL, PASSWORD);
        this.mapper = new UserViewMapper();

        UserView userView = mapper.map(user);

        assertEquals(NAME, userView.getName());
        assertEquals(EMAIL, userView.getEmail());
    }

}