import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello, %s! Lovely to see you", name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        
        return "It's currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }
    
    // NINJA BONUS
    // See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}