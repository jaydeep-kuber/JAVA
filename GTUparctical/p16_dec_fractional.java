import java.util.Scanner;
class Fraction {
    private int real;
    private int imaginary;
    Fraction(int r, int i) {
        real = r;
        imaginary = i;
    }
    // finding greatest common multiple using recursion
    public long GCM(long a, long b) {
        return b == 0 ? a : GCM(b, a % b);
    }
    public String toString() {
        long GCM = GCM(real, imaginary);
        return real / GCM + "/" + imaginary / GCM;
    }
}
class p16_dec_fractional {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a deciaml number : ");
            String decimal = input.nextLine();
 
            // returns index position of decimal point (.)
            int indexofDec = decimal.indexOf(".");
            int len = decimal.substring(indexofDec).length();
            int img = (int) Math.pow(10, len - 1);
            int real = (int) (Double.parseDouble(decimal) * img);
            Fraction fr = new Fraction(real, img);
            System.out.println("The Fraction Number is " + fr);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


