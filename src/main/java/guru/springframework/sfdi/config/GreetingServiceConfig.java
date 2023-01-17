package guru.springframework.sfdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfdi.services.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfdi-config.xml") // Tells spring to bring in xml configuration. Could put here or in main class
@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Profile({"ES", "default"})
    @Bean("I18nService") //override Spring default using the method name to give the bean a specific name to match the EN version as java wouldn't like having two methods of same names
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService I18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    //@Bean - refactored to be used by XML
    //ConstructorGreetingService constructorGreetingService() {
        //return new ConstructorGreetingService();
    //}

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
