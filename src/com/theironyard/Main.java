package com.theironyard;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EmailNotification email = new EmailNotification("new email",
                "this is a new email.", "Chad", "Verizon");

        TextNotification text = new TextNotification("new text",
                "this is a new text.", "Sami", "Sprint");


        email.transport();
        text.transport();

        email.showStatus();
        text.showStatus();

        email.sampleText();

        Object emailClone = email.clone();

        System.out.println("equal? " + email.equals(emailClone));




    }
}
