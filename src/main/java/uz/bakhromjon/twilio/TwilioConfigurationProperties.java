package uz.bakhromjon.twilio;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "twilio")
public class TwilioConfigurationProperties {
    private String accountSid;
    private String authToken;
    private String trialPhone;

    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getTrialPhone() {
        return trialPhone;
    }

    public void setTrialPhone(String trialPhone) {
        this.trialPhone = trialPhone;
    }
}
