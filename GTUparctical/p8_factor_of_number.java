import java.util.Scanner;

public class p8_factor_of_number{

    static void getFactor(int a){
      int i=2;
      System.out.print("Factor of "+a+" is ");
      while(a>1){
        if(a%i==0){
            System.out.print(i+" ");
            a=a/i;
        }else{
            i++;
        }
      }


    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          // take number frome user
          System.out.print("Give a Number: ");
          int num= sc.nextInt();

          getFactor(num);
        }
    }
}