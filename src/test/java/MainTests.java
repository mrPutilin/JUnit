import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class MainTests {

    Main sut;

    @BeforeEach
    public void init() {
        System.out.println("Test started");
        sut = new Main();
    }

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("Test completed");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("Tests completed");
    }

    @Test
    public void listShouldHaveStringTest() {
        String d = "Test";
        List<String> a = new ArrayList<>();
        a.add(d);
        boolean expected = a.contains(d);

        Assertions.assertTrue(expected);


    }

    @Test
    public void listShouldRemoveIndex() {
        List<String> d = new ArrayList<>();
        d.add("fff");
        d.add("iii");
        d.add("aaa");

        d.remove(2);


        List<String> expected = d;

        Assertions.assertLinesMatch(expected, d);

    }

}
