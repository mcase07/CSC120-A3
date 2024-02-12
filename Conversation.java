import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {

    boolean stillGoing = true;

    Scanner sc = new Scanner(System.in);

    System.out.println("How many rounds would you like to talk back and forth for?");      

    // getting user input
    String rounds = sc.nextLine();
    int numRounds = Integer.parseInt(rounds);

    String[] responses = {
      "Okay!",
      "So interesting.",
      "Oh, really?",
      "I didn't know that!"
    };
    Random rand = new Random();
    int randomResponse = rand.nextInt(responses.length);
        

    //responding
    System.out.println("Okay! Will do!");

    int i = 1;

    while (i <= numRounds && stillGoing) {
      
      // getting user input
      String userInput = sc.nextLine();

      // respond
      if(userInput.contains("you")){
        System.out.println("Oh, I'm not that interesting. What about you though?");
      }
      else if(userInput.contains("!")){
        System.out.println("Oh, really?");
      }
      else if(userInput.contains("?")){
        System.out.println("How interesting...");
      }
      else if(userInput.equals("Hi")){
        System.out.println("Hi, how are you?");
      }
      else{
        System.out.println(responses[randomResponse]);
      }
      i++;
    }

    sc.close();

  }
}
