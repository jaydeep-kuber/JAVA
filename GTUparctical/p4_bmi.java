import java.util.Scanner;

public class p4_bmi {
    public static void main(String[] args) {
        System.out.println("BMI Calculator");

        int waightInpn, HeightIninch;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your waight in pound? :");
        waightInpn=sc.nextInt();
        double waightInkg=waightInpn*0.45359237;
        System.out.print("What is your Height  in inch? :");
        HeightIninch=sc.nextInt();
        double HeightInmeter=HeightIninch*0.0254;
        // HeightInmeter=sc.nextInt();

        double BMI=waightInkg/(HeightInmeter*HeightInmeter);
        System.out.println("Your BMI Waight is :" + BMI);


        sc.close();
    }
}
