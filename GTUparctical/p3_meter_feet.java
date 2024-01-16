// meter to feet        parcticle-3
import java.util.Scanner;

public class p3_meter_feet{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println(". . . . .Meter to Feet. . . . \n");
        System.out.print("Enter Meter : ");
        Double mtr = sc.nextDouble();
        Double result= (mtr*3.28084);
        System.out.println("your Result :"+result);
        sc.close();
    }
}
