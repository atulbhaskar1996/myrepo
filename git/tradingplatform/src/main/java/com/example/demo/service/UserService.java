package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.utility.OtpGenerator;


@Service
public class UserService {
	@Autowired
	private UserRepository userrepo;
	@Autowired
	private SendOtpMobile som;
	
	private String otp = null;
	public String insertData(User user) {
		otp = new String(OtpGenerator.generateOtp(4));
		try {
			System.out.println(otp+"------------otp-----");
//			System.out.println(sender);
			System.out.println(user.getEmail());
		//SendMail.sendEmail(otp,user.getEmail());
			System.out.println(som.sendSMS(otp));
		System.out.print("message sent----successfully---");
		}catch(Exception e) {System.out.println("not sent");System.out.println(e);}
		System.out.println(otp+"------------otp-----");
		if(userrepo.save(user)!=null)
			return "success";
		else
			return "fails";
		
	}

}
