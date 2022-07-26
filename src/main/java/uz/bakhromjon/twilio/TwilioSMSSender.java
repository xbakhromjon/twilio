package uz.bakhromjon.twilio;

import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;

@Service
public class TwilioSMSSender {

    private final TwilioConfigurationProperties twilioConfigurationProperties;

    public TwilioSMSSender(TwilioConfigurationProperties twilioConfigurationProperties) {
        this.twilioConfigurationProperties = twilioConfigurationProperties;
    }

    public ResponseEntity<?> sendSMS(SMSRequest smsRequest) {
        if (!isValidPhoneNumber(smsRequest.getPhoneNumber())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Not Valid Phone Number");
        }
        PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
        PhoneNumber from = new PhoneNumber(twilioConfigurationProperties.getTrialPhone());
        MessageCreator messageCreator = new MessageCreator(to, from, smsRequest.getMessage());
        messageCreator.create();
        return ResponseEntity.ok("Success sent");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return true;
    }
}
