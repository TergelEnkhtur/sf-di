package guru.springframework.sfdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"ES", "default"}) - refactored to Java Configuration
//@Service("I18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
