import java.util.Random;

public class p7_Num_plate {

    class numPlate {

        static void fourDigit() {
            Random r = new Random();
            // r = r.nextInt(9999)
            int num1 = r.nextInt(9);
            int num2 = r.nextInt(9);
            int num3 = r.nextInt(9);
            int num4 = r.nextInt(9);

            System.out.print(num1 + " " + num2 + " " + num3 + " " + num4);
            System.out.println(" |");
        }

        static void threeLatter() {
            char[] laters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                    'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
            Random r = new Random();
            int index1 = r.nextInt(laters.length);
            int index2 = r.nextInt(laters.length);
            int index3 = r.nextInt(laters.length);

            char fst, sec, thrd;
            fst = laters[index1];
            sec = laters[index2];
            thrd = laters[index3];
            System.out.print(fst + "" + sec + "" + thrd + " - ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Number Plate");
        System.out.println("-----------------");
        System.out.print("| ");
        numPlate.threeLatter();
        numPlate.fourDigit();
        System.out.println("-----------------");

    }
}

// public class p7_Num_plate {
//     public static void main(String[] args) {
//         int digit1 = (int) (Math.random() * 10);
//         int digit2 = (int) (Math.random() * 10);
//         int alpha1 = 'A' + (int) (Math.random() * ('Z' - 'A'));
//         int alpha2 = 'A' + (int) (Math.random() * ('Z' - 'A'));
//         int alpha3 = 'A' + (int) (Math.random() * ('Z' - 'A'));
//         int alpha4 = 'A' + (int) (Math.random() * ('Z' - 'A'));
//         int digit3 = (int) (Math.random() * 10);
//         int digit4 = (int) (Math.random() * 10);
//         int digit5 = (int) (Math.random() * 10);
//         int digit6 = (int) (Math.random() * 10);
//         System.out.println("" + ((char) (alpha1)) + ((char) (alpha2)) + " " + 
//         digit1 + digit2 + " " + ((char) (alpha3))
//                 + ((char) (alpha4)) + " " + digit3 + digit4 + digit5 + digit6);}}
