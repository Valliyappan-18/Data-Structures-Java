import java.util.Scanner;

public class Recursion {

    public static int fact(int N){
        if(N==0){
            return 1;
        }else{
            return N*fact(N-1);
        }
    }

    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Number to find factorial value:");
        int N = userInput.nextInt();
        int factorial = fact(N);
        System.out.println("Factorial of given number is: "+factorial);
    }
}
