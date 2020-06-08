package guru.springframework;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaJunit4HelloWorldTest {

    @org.junit.Test
    public void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}