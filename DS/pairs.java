package DS;

public class pairs {
    public static void printPairs(int arr[]){
        for(int i =0 ; i<arr.length; i++){
            int current = arr[i];
            for(int j=i+1 ; j<arr.length; j++){
                System.out.print( "("+ current + " , " + arr[j]+ ")");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int[] Set={1,2,3,4,5};
        printPairs(Set);
    }
}
