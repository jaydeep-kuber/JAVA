import java.util.*;

class numbGuess{

    Random rnd = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        Random rn =new Random();
        int getNum = rn.nextInt(100);

        System.out.print("Enter Guessed Number :");
        int UserInp=sc.nextInt(); 

        if(getNum==UserInp){
            System.out.println("you Guessed Right");
        }
        else{
            System.out.println("ooops.... Missed..!");
        }

        sc.close();
    }
}

