package com.haotam.giupviec.demo;

import com.haotam.giupviec.services.WorkerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedDITest {

    private SetterBasedDI setterBasedDI;

    @BeforeEach
    void setup() {
        this.setterBasedDI = new SetterBasedDI();
        setterBasedDI.setWorkerService(new WorkerService(null));
    }

    @Test
    void check() {
        assertEquals(com.haotam.giupviec.constants.Test.HELLO_SPRING, setterBasedDI.greeting());
    }

}