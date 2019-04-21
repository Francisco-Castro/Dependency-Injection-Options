package guru.springframework.didemo.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hellow Gurus!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
