import java.util.Scanner;
import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {

    boolean stillGoing = true;

    Scanner sc = new Scanner(System.in);
    System.out.println("How many rounds would you like to talk back and forth for?");      

    // getting user input of # of lines
    String rounds = sc.nextLine();
    int numRounds = Integer.parseInt(rounds);
    String [] transcript =  new String[2*numRounds];

    String[] canResponses = {
      "Okay!",
      "So interesting.",
      "Oh, really?",
      "I didn't know that!"
    };

    // generates a random index used to choose a response from canResponses list
    Random rand = new Random();
    int randomResponse = rand.nextInt(canResponses.length);

    //responding
    System.out.println("Okay, will do! What's up?");

    // this is here to get around a type issue
    int i = 1;
      // where t is the length of array transcript
    int t = i * 2;

    while (i <= numRounds && stillGoing) {
      // getting user input
      String userInput = sc.nextLine();
      String [] splitInput = userInput.split("\\s+");
      // transcript[t] = userInput;
      // t++;
        if (userInput.contains("you")||userInput.contains("I")||userInput.contains("are")||userInput.contains("am")){
          for (int n = 0; n < splitInput.length; n++){
            if (splitInput[n].equals("you") || splitInput[n].equals("you?")){
              splitInput[n] = "I";
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
          System.out.println(reply + "?");
        }
        else{
          System.out.println(canResponses[randomResponse]);
        }
        // transcript[t] = reply;
        // t++;
      i++;
    }
    sc.close();

  }
}
