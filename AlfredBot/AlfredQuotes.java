import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you.",name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return "It is currently " + new Date();
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis")!=-1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if(conversation.indexOf("Alfred")!=-1){
            return "At your service. As you wish, naturally.";
        }
        else{
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    public String guestGreeting(){
        return "Hello, Guest. Lovely to see you. What do I call you please?";
    }
    public String yellGreeting(){
        return "Hello, Guest, How do I help you?".toUpperCase();
    }
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

