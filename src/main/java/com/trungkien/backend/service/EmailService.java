package com.trungkien.backend.service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.trungkien.backend.entity.Email;

public interface EmailService {
    void sendEmail(Email email) throws MessagingException;

    void resetPassword(String email, String token) throws MessagingException;
}
