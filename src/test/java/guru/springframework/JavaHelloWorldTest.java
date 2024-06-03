package guru.springframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaHelloWorldTest {

    @Test
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        Assert.assertEquals(javaHelloWorld.getHello(), "Hello World");
    }
}