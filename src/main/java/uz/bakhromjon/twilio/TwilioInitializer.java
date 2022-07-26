package uz.bakhromjon.twilio;

import com.twilio.Twilio;
import org.springframework.context.annotation.Configuration;
import uz.bakhromjon.twilio.TwilioConfigurationProperties;

@Configuration
public class TwilioInitializer {
    private final TwilioConfigurationProperties twilioConfigurationProperties;


    public TwilioInitializer(TwilioConfigurationProperties twilioConfigurationProperties) {
        this.twilioConfigurationProperties = twilioConfigurationProperties;
        Twilio.init(twilioConfigurationProperties.getAccountSid(), twilioConfigurationProperties.getAuthToken());
    }


}
