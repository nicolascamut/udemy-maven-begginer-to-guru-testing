package guru.springframework

import spock.lang.Specification

class JavaHelloWorldSpecTest extends Specification {

    def "GetHello"() {
        expect:
        new JavaHelloWorld().getHello() == "Hello World"
    }
}
