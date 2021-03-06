package com.theironyard;

import java.time.LocalDateTime;


public abstract class Notification {


    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "check status";


    //===========================================//


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }



    //=============================================//



    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }


    //=============================================//


    public abstract void transport();

    public void showStatus() {
        System.out.println(this.status);
    }

    protected void sampleText(){
        System.out.println("This is some sample text for protected method");
    }


}

