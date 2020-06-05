package guru.springframework;

public class JavaHelloWorldTest {
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert("Hello Worlds".equals(javaHelloWorld.getHello()));
    }
}