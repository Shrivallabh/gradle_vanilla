package com.confengine.gradle.client;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Petri Kainulainen
 */
public class HelloWorldTest {

    private HelloWorld helloWorld;

    @Before
    public void setUp() {
        helloWorld = new HelloWorld();
    }

    @Test
    public void test(){
        helloWorld.logHello();
    }
}
