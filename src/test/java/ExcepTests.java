import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;


public class ExcepTests {
    Excep sut;

    @BeforeEach
    public void init() {
        System.out.println("Test started");
        sut = new Excep();
    }

    @AfterEach
    public void end(){
        System.out.println("Test completed");
    }




    @Test
    public void shouldThrowUserNotFoundException() throws UserNotFoundException {
        Exception exception = Assertions.assertThrows(Exception.class,
                () -> Excep.getUserByLoginAndPassword("dd", "jkl"), "Пользователь не найден");
        Assertions.assertEquals("Пользователь не найден", exception.getMessage());

    }
}
