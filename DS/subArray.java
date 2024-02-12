package DS;
// find sum of sub arrays and print max and min among them.
public class subArray {

    public static void printSubAry(int[] ary){
        int n = ary.length;
        int sum = 0 , min=0 , max=9999;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("[");
                for(int k=i ; k<=j; k++){
                    System.out.print(ary[k]);
                    sum=sum+ary[k];
                }
                if (sum<min) min=sum;
                if (sum>max) max=sum;
                
                System.out.println("]"+ " Sum=" + sum);
                sum=0;
            }
            System.out.println();
        }
        System.out.println("min"+ min);
        System.out.println("max"+max);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        printSubAry(arr);
    }
}
