package com.codingshuttle.project.uber.uberApp.services;

public interface EmailSenderService {
    public void sendEmail(String email, String subject, String body);

    public void sendEmail(String toEmail[], String subject, String body);
}
