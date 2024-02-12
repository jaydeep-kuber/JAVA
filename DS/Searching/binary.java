package DS.Searching;

class binary {

    public static int Bsearch(int arr[], int key){
        int st=0 , end= arr.length-1;

        while (st<=end) {

            int mid = (st+end)/2;

            if(arr[mid]==key){ return mid;}
            if(arr[mid]<key){st=mid+1;} // right case
            else{end = mid-1;}
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8}; 
        int key = 6;

        System.out.println("your key fond at "+Bsearch(arr , key));
        
    }
    
}
