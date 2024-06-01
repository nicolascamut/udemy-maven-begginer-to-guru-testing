package guru.springframework;

public class JavaHelloWorldTest {

    // one of the convention of pojo testing with maven surefire is the method name should start with test
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert(javaHelloWorld.getHello().equals("Hello World"));
    }

}