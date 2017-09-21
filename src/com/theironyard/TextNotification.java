package com.theironyard;

public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;



//====================================================//



    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        this.status = "text status";
        this.sampleText();
    }


//=====================================================//



    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }


//=====================================================//




    @Override
    public void transport() {
        System.out.println("Subject: " + this.getSubject());
        System.out.println("body: " + this.getBody());
        System.out.println("Created: " + this.getCreatedAt());
        System.out.println("Recipient: " + this.getRecipient());
        System.out.println("Provider: " + this.getSmsProvider());

    }
}
