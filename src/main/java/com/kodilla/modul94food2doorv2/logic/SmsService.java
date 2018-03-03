package com.kodilla.modul94food2doorv2.logic;

import com.kodilla.modul94food2doorv2.data.User;

public class SmsService implements InformationService {
    public void inform(User user){
        System.out.println("Sending sms to: " + user);
    }
}
