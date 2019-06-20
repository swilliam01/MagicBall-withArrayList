import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Magic8ball {

    public static void main(String[] args) {
        Scanner yy = new Scanner(System.in);
        Random xx = new Random();
        ArrayList<String> list=new ArrayList<String>();
        String choice="N",input,Answer;
        list.add("It is certain");
        list.add("It is decidely so");
        list.add("Without a doubt");
        list.add("yes definitely");
        list.add("you may rely on it");
        list.add("As I see it,yes");
        list.add("Most likely");
        list.add("outlook good");
        list.add("yes");
        list.add("Signs point to yes");
        list.add("Reply hazy try again");
        list.add("Ask again later");
        list.add("better not tell you now");
        list.add("cannot predict now");
        list.add("concentrate and ask again");
        list.add("Don't count on it");
        list.add("My reply is no");
        list.add("My sources say no");
        list.add("outlook not so good");
        list.add("very doubtful");
        do {


            System.out.println(" Please type in your questions:");
            input = yy.nextLine();
            int random = (int)xx.nextInt(list.size());

            Answer=list.get(random);
            System.out.println(Answer);

            System.out.println("Would you like to Answer more question?(yes/No)");

            choice = yy.nextLine();
//            if(choice.equalsIgnoreCase("Yes")){
//                continue;
//
//            }


        }
        while (!choice.equalsIgnoreCase("No")) ;

//        System.out.println("Your question is:"+input);
//        System.out.println("MAGIC 8-BALL SAYS:"+Answer);
        System.out.println("Thank you!!!!");


    }
}
