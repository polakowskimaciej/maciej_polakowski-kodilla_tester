package com.kodilla.abstracts.homework;

public class PersonApplication {
    public static void main(String[] args) {
        Person person = new Person("Maciej",30, new Tester(1000,"Testing"));
        JobProcessor jobProcessor = new JobProcessor();
        jobProcessor.process(person.getJob());
    }
}
