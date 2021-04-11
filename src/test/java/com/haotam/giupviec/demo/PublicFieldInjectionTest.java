package com.haotam.giupviec.demo;

import com.haotam.giupviec.services.WorkerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicFieldInjectionTest {
    private PublicFieldInjection publicFieldInjection;

    @BeforeEach
    void setup() {
        this.publicFieldInjection = new PublicFieldInjection();
        publicFieldInjection.workerService = new WorkerService(null);
    }

    @Test
    void check() {
        assertEquals(publicFieldInjection.greeting(), com.haotam.giupviec.constants.Test.HELLO_SPRING);
    }

}