package guru.springframework.didemo;

import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{

        System.out.println(GreetingServiceImpl.HELLO_GURUS);
        System.out.println(propertyInjectedController.sayHello());

        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS,
                propertyInjectedController.sayHello());
    }
}
