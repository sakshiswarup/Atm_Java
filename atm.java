package loop;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cdn ="yes";//cdn = condition var name
        while(cdn.equals("yes")) {
            System.out.println("enter your amount:");
            if(scan.hasNextInt()) {
                int amount = scan.nextInt();//reading integer
                scan.nextLine();//consume leftover new line
                System.out.println("please collect your cash");
            }
            else {
                System.out.println("Invalid input , Please enter a number.");
                scan.nextLine();
                continue;
            }
            System.out.println("Do you want to continue(Yes/No)");
            cdn=scan.nextLine();

        }
        scan.close();
        System.out.println("Thank you for using our service!");
    }
}


