import java.util.Scanner;

public class TwoVariableToSum {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input how much number do you want to use: ");
        int numbersInformation = scan.nextInt();
        double counter = 0;
        while(numbersInformation > 0){
            System.out.println("Number to add: ");
            counter += scan.nextDouble();
            numbersInformation --;
        }

        System.out.println(counter);

    }
}
