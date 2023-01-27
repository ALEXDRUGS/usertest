import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private final User user = new User("login", "blabla@gmail.com");
    private final User emptyUser = new User();

    @Test
    @DisplayName("Проверка правильного заполнения поля login при создании объекта")
    void getLoginTest() {
        assertEquals("login", user.getLogin());
    }

    @Test
    @DisplayName("Проверка правильного заполнения поля email при создании объекта")
    void getEmailTest() {
        assertEquals("blabla@gmail.com", user.getEmail());
    }

    @Test
    @DisplayName("Проверка пустого заполнения поля login при создании объекта")
    void getEmptyLoginTest() {
        assertNull(emptyUser.getLogin());
    }

    @Test
    @DisplayName("Проверка пустого заполнения поля email при создании объекта")
    void getEmptyEmailTest() {
        assertNull(emptyUser.getEmail());
    }

    @Test
    @DisplayName("Проверка наличия символа '@' в email")
    void isAtInEmailTest() {
        assertTrue(user.getEmail().contains("@"));
    }

    @Test
    @DisplayName("Проверка наличия символа '.' в email")
    void isDotInEmailTest() {
        assertTrue(user.getEmail().contains("."));
    }

    @Test
    @DisplayName("Проверка сравнения полей login и email при создании объекта")
    void comparisonLoginAndEmailTest() {
        assertNotEquals(user.getLogin(), user.getEmail());
    }
}
