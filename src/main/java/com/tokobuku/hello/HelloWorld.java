package com.tokobuku.hello;

public class HelloWorld implements Hello {

    private String message;
    private String question;
    private String origin;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public void printMessage() {
        System.out.println("Your Message: " + message);
        System.out.println("Your Question: " + question);
        System.out.println("Your Origin: " + origin);
    }
}
