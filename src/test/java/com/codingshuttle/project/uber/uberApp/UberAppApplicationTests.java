package com.codingshuttle.project.uber.uberApp;

import com.codingshuttle.project.uber.uberApp.services.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UberAppApplicationTests {

	@Autowired
	private EmailSenderService emailSenderService;

	@Test
	void contextLoads() {
		emailSenderService.sendEmail(
				"rizwanrkz777@gmail.com",
				"This is the testing email",
				"this is testing email from Spring boot"
		);
	}

	@Test
	void sendMultipleEmails() {
		String emails[] = {"rizwankohli@gmail.com", "rizwanrkkz777@gmail.com"};

		emailSenderService.sendEmail(
				emails,
				"Uber App demo",
				"this is testing email from Spring boot"
		);
	}

}
