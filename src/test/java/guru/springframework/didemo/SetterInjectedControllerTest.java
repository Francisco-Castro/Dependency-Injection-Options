package guru.springframework.didemo;

import guru.springframework.didemo.controllers.SetterInjectedController;
import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGrestting() throws Exception {

        System.out.println(GreetingServiceImpl.HELLO_GURUS);

        System.out.println(setterInjectedController.sayHello());

        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS,
                this.setterInjectedController.sayHello());
    }
}
