import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Magic8ball {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();


        String userResponse= " ";

        //creating a list to store the response
        ArrayList<String> magicResponse = new ArrayList<>();
        magicResponse.add("It is certain");
        magicResponse.add("It is decidedly so");
        magicResponse.add("Without a doubt");
        magicResponse.add("Yes definitely");
        magicResponse.add("You may rely on it");
        magicResponse.add("As I see it, yes");
        magicResponse.add("Most likely");
        magicResponse.add("Outlook good");
        magicResponse.add("Yes");
        magicResponse.add("Signs point to yes");
        magicResponse.add("Reply hazy try again");
        magicResponse.add("Ask again later");
        magicResponse.add("Better not tell you now");
        magicResponse.add("Cannot predict now");
        magicResponse.add("Concentrate and ask again");
        magicResponse.add("Don't count on it");
        magicResponse.add("My reply is no");
        magicResponse.add("My sources say no");
        magicResponse.add("Outlook not so good");
        magicResponse.add("Very doubtful");

        // a new variable to store the size of the list
        int index = magicResponse.size();

        do {
            //asking the user for a question
            System.out.println("Ask your question to the magic ball:");
            String input = keyboard.nextLine();

            System.out.println("You asked: " + input + "\n");

            // generating a random answer from the list
            int getRandom = rand.nextInt(index);
            String randomChoice = magicResponse.get(getRandom);

            //printing the answer
            System.out.println("MAGIC 8-BALL SAYS: " + randomChoice);

            //asking user to play again
            System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
            //saving user's answer
            userResponse=keyboard.nextLine();

            //the loop will not end if the user's response is not 'n'
        }while(!userResponse.equalsIgnoreCase("n"));

        System.out.println("Thank you for playing! ");

        
    }
}
