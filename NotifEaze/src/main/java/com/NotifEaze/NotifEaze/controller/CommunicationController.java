package com.NotifEaze.NotifEaze.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NotifEaze.NotifEaze.dto.BaseEmailResponse;
import com.NotifEaze.NotifEaze.dto.BasePushNotificationResponse;
import com.NotifEaze.NotifEaze.dto.BaseSmsResponse;
import com.NotifEaze.NotifEaze.service.EmailService;
import com.NotifEaze.NotifEaze.service.PushNotificationService;
import com.NotifEaze.NotifEaze.service.SmsService;

@RestController
@RequestMapping("/api/communication")
public class CommunicationController {
	
	 	@Autowired
	    private SmsService smsService;

	    @Autowired
	    private EmailService emailService;

	    @Autowired
	    private PushNotificationService pushNotificationService;
	
	
    @PostMapping("/send-sms")
    public ResponseEntity<BaseSmsResponse> sendSms() {
        /* To be developed */
        return ResponseEntity.ok().build();
    }

    @PostMapping("/send-email")
    public ResponseEntity<BaseEmailResponse> sendEmail() {
        /* To be developed */
        return ResponseEntity.ok().build();
    }

    @PostMapping("/send-notification")
    public ResponseEntity<BasePushNotificationResponse> sendNotification() {
        /* To be developed */
        return ResponseEntity.ok().build();
    }
}
