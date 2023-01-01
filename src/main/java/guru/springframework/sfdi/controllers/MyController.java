package guru.springframework.sfdi.controllers;

import guru.springframework.sfdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    //@Autowired          - optional as of Spring 4.2
    public MyController(GreetingService greetingService) { //@Qualifier no need because of @Primary
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
