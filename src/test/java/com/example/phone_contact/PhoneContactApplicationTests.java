package com.example.phone_contact;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.phone_contact.endpoint.rest.controller.HealthRestController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PhoneContactApplicationTests {
    private final HealthRestController subject = new HealthRestController();

    @Test
    void test_health_rest_controller_with_ping() {
        String expected = subject.ping();

        assertEquals("pong", expected);
    }

    @Test
    void test_health_rest_controller_with_home() {
        String expected = subject.home();

        assertEquals("Hello World", expected);
    }

}
