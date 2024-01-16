import java.util.Scanner;

public class p15_bin2Dec {

    public static int bin2Dec(String binString) throws NumberFormatException {

        int decimal = 0;
        int strLength = binString.length();
        for (int i = 0; i < strLength; i++) {
            if (binString.charAt(i) < '0' || binString.charAt(i) > '1') {
                throw new NumberFormatException("Please Enter a Binary String");
            }
            decimal += (binString.charAt(i) - '0') * Math.pow(2, strLength - i - 1);
        }
        return decimal;
    } 

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Binary String : ");
            String str = input.nextLine();
            try {
                System.out.println("Value of binary to decimal is : " + bin2Dec(str));
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
    }

}
