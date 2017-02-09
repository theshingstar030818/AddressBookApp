package app.greeting;

/**
 * Created by tanzeelrana on 2/9/2017.
 */

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet() {
        return "Hello World";
    }
}
