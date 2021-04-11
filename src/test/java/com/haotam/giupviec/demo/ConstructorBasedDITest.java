package com.haotam.giupviec.demo;

import com.haotam.giupviec.services.WorkerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorBasedDITest {

    private ConstructorBasedDI constructorBasedDI;

    @BeforeEach
    void setUp() {
        this.constructorBasedDI = new ConstructorBasedDI(new WorkerService(null));
    }

    @Test
    public void check() {
        assertEquals(com.haotam.giupviec.constants.Test.HELLO_SPRING, constructorBasedDI.sayHello());
    }
}