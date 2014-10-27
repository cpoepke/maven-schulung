package de.codecentric.maven;

public class Service {
    public String sayHelloFromLibrary() {

        System.out.println("Service.sayHelloFromLibrary() called"); // TODO use logging framework

        return "Hello Library!";
    }
}
