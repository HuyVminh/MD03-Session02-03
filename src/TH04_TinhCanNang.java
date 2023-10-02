import java.util.Scanner;

public class TH04_TinhCanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (in kilogram):");
        weight = sc.nextDouble();

        System.out.println("Your height (in meter):");
        height = sc.nextDouble();
        bmi = weight / (height * height);
        System.out.println(bmi + "Interpretation");
        if (bmi < 18)
            System.out.println(bmi + "Underweight");
        else if (bmi < 25.0)
            System.out.println(bmi + "Normal");
        else if (bmi < 30.0)
            System.out.println(bmi + "overweight");
        else
            System.out.println(bmi + "Obese");
    }
}


