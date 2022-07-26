package uz.bakhromjon.twilio;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sms")
public class SMSController {
    private final TwilioSMSSender twilioSMSSender;

    public SMSController(TwilioSMSSender twilioSMSSender) {
        this.twilioSMSSender = twilioSMSSender;
    }

    @PostMapping("")
    public ResponseEntity<?> sendSMS(@RequestBody SMSRequest smsRequest) {
        return twilioSMSSender.sendSMS(smsRequest);
    }
}
