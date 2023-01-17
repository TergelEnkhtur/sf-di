package guru.springframework.sfdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("EN") - refactored to Java Configuration
//@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
