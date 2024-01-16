import java.util.Scanner;

public class p10_ten_num_rev {

    public static void revert(int[] nums){
    for (int i=nums.length-1;i>-1;i--) {
        System.out.print(" "+nums[i]+" ");
    }
    }
    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            int []tenNum=new int[10];
            System.out.println("Enter 10 numbers : ");
            for (int i=0 ; i<tenNum.length;i++) {
                System.out.print("Number:"+(i+1)+" ");
                tenNum[i] = sca.nextInt();
            }

            // System.out.print(tenNum[0]);

            revert(tenNum);
        }
    }
}
