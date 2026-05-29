package com.chiranjibi.staging.config;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.Clock;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class AppConfigTest {

    @Autowired
    private Clock systemClock;

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void appBeansAreAvailable() {
        assertNotNull(systemClock);
        assertNotNull(restTemplate);
    }
}

