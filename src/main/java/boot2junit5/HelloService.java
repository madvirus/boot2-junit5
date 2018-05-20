package boot2junit5;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String hello(String name) {
        return name;
    }
}
