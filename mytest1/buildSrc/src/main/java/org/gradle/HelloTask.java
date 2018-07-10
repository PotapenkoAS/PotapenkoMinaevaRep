package org.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class HelloTask extends DefaultTask {
    private String message;
    private String recipient;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @TaskAction
    void sayGreeting() {
        System.out.printf("%s, %s!\n", getMessage(), getRecipient());
    }

    @TaskAction
    void SayGoodBye() {
        System.out.println("GoodBye from SayGoodBye method");
    }

    @TaskAction
    void SayHello() {
        System.out.println("Hello from SayHello method");
    }

    class SuperHelloTask extends DefaultTask {

    }
}