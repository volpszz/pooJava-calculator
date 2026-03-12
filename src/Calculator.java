import java.util.Scanner;
import calculus.Calculus;


public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        runCalculator(sc);
    }
    
    private static void runCalculator (Scanner sc){
        char again;
        double a;
        double b;
        char type;

            System.out.println("Welcome to Calculator!");

            do {
                System.out.println("What is the first number?");
                a = sc.nextDouble();

                System.out.println("What is the second number?");
                b = sc.nextDouble();

                System.out.println("What operation do you want? (+ | - | * | /)");
                type = sc.next().charAt(0);

                processOperation(a,b,type);

                System.out.println("Do you want to continue? (s/n)");
                again = sc.next().toLowerCase().charAt(0);

            } while (again == 's');

            System.out.println("Ending Calculator!");
            sc.close();
        }


private static void processOperation(double a,double b,char type){
    switch(type){
        case '+': Calculus.showResult(Calculus.add(a,b));
        case '-': Calculus.showResult(Calculus.subtract(a,b));
        case '*': Calculus.showResult(Calculus.multiply(a,b));
        case '/': Calculus.showResult(Calculus.divide(a,b));
    }
  }
}


