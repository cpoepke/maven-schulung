package de.codecentric.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServiceTest {

    @Test
    public void testSayHelloFromLibrary() throws Exception {
        assertEquals("Hello Library!", new Service().sayHelloFromLibrary());
    }
}