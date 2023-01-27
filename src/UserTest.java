import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    @DisplayName("Проверка правильного заполнения поля login при создании объекта")
    void getLoginTest() {
        User user = new User("login", "blabla@gmail.com");
        assertEquals("login", user.getLogin());
    }

    @Test
    @DisplayName("Проверка правильного заполнения поля email при создании объекта")
    void getEmailTest() {
        User user = new User("login", "blabla@gmail.com");
        assertEquals("blabla@gmail.com", user.getEmail());
    }

    @Test
    @DisplayName("Проверка пустого заполнения поля login при создании объекта")
    void getEmptyLoginTest() {
        User user = new User();
        assertNull(user.getLogin());
    }

    @Test
    @DisplayName("Проверка пустого заполнения поля email при создании объекта")
    void getEmptyEmailTest() {
        User user = new User();
        assertNull(user.getEmail());
    }

    @Test
    @DisplayName("Проверка наличия символа '@' в email")
    public void isAtInEmailTest() {
        User user = new User("login", "blabla@gmail.com");
        assertTrue(user.getEmail().contains("@"));
    }

    @Test
    @DisplayName("Проверка наличия символа '.' в email")
    public void isDotInEmailTest() {
        User user = new User("login", "blabla@gmail.com");
        assertTrue(user.getEmail().contains("."));
    }

    @Test
    @DisplayName("Проверка сравнения полей login и email при создании объекта")
    void comparisonLoginAndEmailTest() {
        User user = new User("login", "blabla@gmail.com");
        assertNotEquals(user.getLogin(), user.getEmail());
    }
}
