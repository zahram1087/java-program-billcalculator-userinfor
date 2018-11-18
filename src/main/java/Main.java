import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//        codeChallengeTwo();
        restaurantBill();

//    Scanner scanner = new Scanner (System.in);

//
//    System.out.println("What is your name?");
//    String userName = scanner.nextLine(); //takes only the first token even if user gives 1st & last name.you can envoke another next method that takes in the second token
//    //nextLine() method will read the whole line storing all tokens in that line
//    System.out.println(userName + " is your name.");
    }
    public static void codeChallengeTwo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();


        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("Amount of money in your pocket: $ ");
        double money = scanner.nextDouble();

        double moneyNeeded = Math.ceil(money)- money;

        System.out.println("Your name is " + name + " and you are " + age + " old.");
        System.out.format("You have $ %.2f and you need $ %.2f", money , moneyNeeded);

        System.out.format("\nYou've lived %d. In another %d years you'll be %d years old.", age, age, age*2);

        System.out.format("\nyour name has %d characters", name.length());
    }

    public static void restaurantBill(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much was your bill?");
        double billAmount = scanner.nextDouble();

        System.out.println("How many people is the bill being divided by?");
        int people = scanner.nextInt();

        System.out.format("Each person should pay  $ %.02f", billAmount/people);

        //Write a program which divides a restaurant bill so that each person pays an equal amount
        //150
        //3 people
        //150/3
        //each will pay this much
    }
}
