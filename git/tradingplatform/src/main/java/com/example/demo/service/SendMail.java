package com.example.demo.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;


public class SendMail {


	@Autowired
	private  static JavaMailSender sender;

	
	public static void sendEmail(String msg, String email) throws Exception{
		System.out.println("send email method call  "+sender+"--------");
		MimeMessage message = sender.createMimeMessage();
		System.out.println("send email method call  1");
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setTo(email);
		helper.setText(msg);
		helper.setSubject("Hi");
		sender.send(message);

	}
	/*tring home() {

		try {

			sendEmail();

			return "Email Sent!";

		} catch (Exception ex) {

			return "Error in sending email: " + ex;

		}

	}*/

	



}
