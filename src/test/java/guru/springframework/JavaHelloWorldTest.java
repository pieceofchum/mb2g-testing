package guru.springframework;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {

    @org.junit.Test
    public void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}