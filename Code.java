package myProject;

import java.util.Scanner;
public class How_Old_APP {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args)
    {

                int age = 0;

                System.out.print("How old are you? ");

                age = userinput.nextInt();

                int futureAge = 5 + age;

                System.out.println("In 5 years you will be " + futureAge + " years old.");

                System.out.println("It is " + ((age < 20) && (age > 12)) +" that you are a teenager");

                System.out.println("I am such a smart computer.");

    }
}
