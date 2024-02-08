import java.util.Scanner;
class Conversation {

  public static void main(String[] arguments) {

    boolean stillGoing = true;

    Scanner sc = new Scanner(System.in);

    System.out.println("How many rounds would you like to talk back and forth for?");

    // getting user input
    String rounds = sc.nextLine();
    int numRounds = Integer.parseInt(rounds);

    // responding
    // System.out.println("Okay! it is!");

    int i = 1;

    while (i <= numRounds && stillGoing) {
      
      // getting user input
      String userInput = sc.nextLine();

      // respond
      if(userInput.contains("?")){
        System.out.println("How interesting...");
      }

      i++;
    }

    sc.close();

    // You will start the conversation here.
  }
}
