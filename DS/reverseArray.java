package DS;

public class reverseArray {
    public static void revArray( int arr[]){

        int start = 0, end = arr.length -1 ;

        while (start<end){
            int temp = arr[end];
            arr[end] = arr[start] ;
            arr[start] = temp ;

            start++ ;
            end-- ;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println("Given array is : ");
        for(int i:arr)
        {
            System.out.print(i + " ") ;
        }
        System.out.println();
        System.out.println("Reversed array is :");
        revArray(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
