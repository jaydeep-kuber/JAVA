import java.util.Scanner;

public class p9_GDC_of_number {
     public static int gcd(int num1, int num2){
        int result =Math.min(num1, num2);
        while(result>0){
            if(num1%result==0&&num2%result==0){
                break;
            }
            result--;
        }
        return result;
    }
    public static void main(String[] args) {
        int n1, n2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st number :");
            n1=sc.nextInt();
            System.out.print("Enter 2nd number :");
            n2=sc.nextInt();
        }
        System.out.println("GDC(Greatest common divisor) of number "+n1+" and "+n2+" is "+" "+gcd(n1, n2));
    }
}
