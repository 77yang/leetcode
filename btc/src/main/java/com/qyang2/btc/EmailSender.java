package com.qyang2.btc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {
    @Value("${spring.mail.username}")
    private String source;
    @Autowired
    private JavaMailSender mailSender;


    public void send(String targetEmail,String subject,String text){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(source);
        message.setTo(targetEmail);
        message.setSubject(subject);
        message.setText(text);
        new Thread(()-> mailSender.send(message)).start();
    }

}
