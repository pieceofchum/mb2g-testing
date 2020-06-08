package guru.springframework;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}