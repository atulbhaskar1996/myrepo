package com.example.demo.utility;


import com.example.demo.twilio.Twilio; 
import com.example.demo.twilio.rest.api.v2010.account.Message; 
import com.example.demo.twilio.rest.api.v2010.account.MessageCreator; 
import com.example.demo.twilio.type.PhoneNumber; 
 
import java.math.BigDecimal; 
import java.net.URI; 
import java.util.ArrayList; 
import java.util.List; 
 
public class SendOtpMobile { 
    private final static String ACCOUNT_SID = "AC996a808dd8eda7576f6af16c001ce0eb"; 
    private final static String AUTH_TOKEN = "[AuthToken]"; 
 
    public static void main(String[] args) { 
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
         
        MessageCreator messageCreator = Message.creator( 
            "AC996a808dd8eda7576f6af16c001ce0eb", 
            new PhoneNumber("+917678629194") 
        ); 
    
         
        Message message = messageCreator.create(); 
        System.out.println(message.getSid()); 
    } 
}