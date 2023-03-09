// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Example 
{
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("ACa2abb2e7b315b8c005a3850220af2edc");
    public static final String AUTH_TOKEN = System.getenv("5988ed4226bc64d28ced3f4dafa27259");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+917874014621"),
                new com.twilio.type.PhoneNumber("+917874014621"),
                "Where's Wallace?")
            .create();

        System.out.println(message.getSid());
    }
}