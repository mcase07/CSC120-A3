import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Conversation {

  public static void main(String[] arguments) {

    boolean stillGoing = true;

    Scanner sc = new Scanner(System.in);
    System.out.println("How many rounds would you like to talk back and forth for?");      

    // getting user input of # of lines
    String rounds = sc.nextLine();
    int numRounds = Integer.parseInt(rounds);

    // canned responses
    String[] canResponses = {
      "Oh, okay",
      "Mmhmm",
      "Oh, really?",
      "Uh huh"
    };

    // responding
    System.out.println("Okay, will do! What's up?");

    // creating transcript array
    ArrayList<String> transcript = new ArrayList<String>();

    // this is here to get around a type issue
    int i = 1;
    // where t is the length of array transcript
    while (i <= numRounds && stillGoing) {
      // getting user input
      String userInput = sc.nextLine();
      transcript.add(userInput);
      String [] splitInput = userInput.split("\\s+");
        if (userInput.contains("you")||userInput.contains("I")||userInput.contains("are")||userInput.contains("am")){
          for (int n = 0; n < splitInput.length; n++){
            if (splitInput[n].equals("you")){
              splitInput[n] = "I";
            }
            else if (splitInput[n].equals("you?")){
              splitInput[n] = "I?";
            }
            else if (splitInput[n].equals("I")|| splitInput[n].equals("i")){
              splitInput[n] = "you";
            }
            else if (splitInput[n].equals("are")){
              splitInput[n] = "am";
            }
            else if (splitInput[n].equals("am")){
              splitInput[n] = "are";
            }
          }
          String reply = String.join(" ", splitInput);
          if (userInput.contains("?")){
              transcript.add(reply);
              System.out.println(reply);
            }
          else{
            reply = reply + "?";
            transcript.add(reply);
            System.out.println(reply);
          }
        }
        else{
          // generates a random index used to choose a response from canResponses list
          Random rand = new Random();
          int randomResponse = rand.nextInt(canResponses.length);
          String canReply = canResponses[randomResponse];
          transcript.add(canReply);
          System.out.println(canReply);
        }
      i++;
    }

    // outputting transcript one line at a time
    System.out.println("\n" + "Here is a transcript of our conversation:");
    for (String t : transcript){
      System.out.println(t);
    }
    sc.close();

  }
}
