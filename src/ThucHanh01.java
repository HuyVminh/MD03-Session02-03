import java.util.Scanner;

public class ThucHanh01 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Rsolver");
        System.out.println("Given a equation 'a *x +b = c', please enter constants");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a : ");
        double a = sc.nextDouble();
        System.out.println(" Enter b : ");
        double b = sc.nextDouble();
        System.out.println(" Enter c : ");
        double c = sc.nextDouble();
        if(a !=0){
            double x=(c-b)/a;
            System.out.println("Equation pass with x = " + x);
        }else {
            if(b==c){
                System.out.println("The solution is all x!");
            }else {
                System.out.println("No solution");
            }
        }

    }
}
