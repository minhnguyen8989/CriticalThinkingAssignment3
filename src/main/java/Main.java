import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //Declare Variable
        double total = 0.0;
        double average = 0.0;
        double maximun = Double.NEGATIVE_INFINITY;
        double minimun = Double.POSITIVE_INFINITY;
        double interest = 0.0;
        int count = 1;

        //While loop to read 5 values
        while (count <= 5) {
            System.out.print("Please enter input " + count + ": ");
            double userInput = sc.nextDouble();
            //Hold the maximum userInput
            if (userInput > maximun) {
                maximun = userInput;
            }
            //Hold the minimum userInput
            if (userInput < minimun) {
                minimun = userInput;
            }
            //Calculate total, average, interest
            total += userInput;
            average = total / count;
            interest = total * .20;
            count++;
        }

        //Print Results
        System.out.println("Total is " + total);
        System.out.println("Average is " + average);
        System.out.println("Maximum number is " + maximun );
        System.out.println("Minimum number is " + minimun);
        System.out.println("Interest rate is " + interest);

    }

}
