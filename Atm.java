import java.awt.*;
import java.util.Scanner;

public class Atm {
        public static void main(String[] args)
        {
            int pin = 1234;
            int balance = 10000;
            int Addamount = 0;
            int Takeamount = 0;

            Scanner scanner  = new Scanner(System.in);
            System.out.print("Enter your pin number: ");
            int password = scanner.nextInt();
            scanner.nextLine();
            if(password == pin)
            {
                System.out.print("Enter your Name: ");
                String name = scanner.nextLine();
                System.out.println("Welcome "+ name);

                while (true)
                {
                    System.out.println("Press 1 to check Balance ");
                    System.out.println("Press 2 to add amount ");
                    System.out.println("Press 3 to take amount ");
                    System.out.println("Press 4 to take receipt ");
                    System.out.println("Press 5 to EXIT ");
                    System.out.println("================================");

                    int option = scanner.nextInt();
                    switch (option)
                    {
                        case 1:
                            System.out.println("================================");
                            System.out.println("Your current Balance is "+balance);
                            System.out.println("================================");
                            break;
                        case 2:
                            System.out.print("How much amount did you want to add to your account:  ");
                            Addamount = scanner.nextInt();
                            System.out.println("================================");
                            System.out.println("Amount credited Sucessfully!");
                            System.out.println("================================");
                            balance=Addamount + balance;
                            break;
                        case 3:
                            System.out.print("How much amount did you want to take:  ");
                            Takeamount = scanner.nextInt();
                            if(Takeamount>balance)
                            {
                                System.out.println("================================");
                                System.out.println("Insufficient Balance!");
                                System.out.println("Try Less than your current balance account");
                                System.out.println("================================");
                            }
                            else
                            {   System.out.println("================================");
                                System.out.println("Amount debited Sucessfully!");
                                System.out.println("================================");
                            }
                            balance = balance - Takeamount;
                            break;
                        case 4:
                            System.out.println("================================");
                            System.out.println("Welcome to all in one mini ATM");
                            System.out.println("--------------------------------");
                            System.out.println("Available Balance: "+balance);
                            System.out.println("--------------------------------");
                            System.out.println("Amount Deposited:  "+Addamount);
                            System.out.println("--------------------------------");
                            System.out.println("Amount Taken:      "+Takeamount);
                            System.out.println("--------------------------------");
                            System.out.println("Thank You Visit Again :)");
                            System.out.println("================================");
                            break;
                        case 5:
                            System.out.println("Collect Your Card :)");
                            System.exit(0);

                    }
                    if(option>5)
                    {
                        System.out.println("Invalid Operation");
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Wrong Pin Number!");
            }
        }
}
