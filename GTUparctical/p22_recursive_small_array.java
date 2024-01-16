// import java.util.Scanner;
// public class p22_recursive_small_array
// {
//     public static void main(String[] args)
//     {
//         try (Scanner input = new Scanner(System.in)) {
//             System.out.print("Enter five integers: ");
//             int[] list = new int[5];
//             for (int i = 0; i < list.length; i++)
//             {
//                 list[i] = input.nextInt();
//             }

//             System.out.println("The smallest element is " + min(list));
//         }
//     }
//     public static int min(int[] list)
//     {
//         int min = list[list.length - 1];
//         int index = list.length - 1;
//         return min(list, index, min);
//     }
//     private static int min(int[] list, int index, int min)
//     {
//         if (index < 0)
//         {
//             return min;
//         }
//         else if (list[index] < min)
//         {
//             return min(list, index - 1, list[index]);
//         }
//         else
//         {
//             return min(list, index - 1, min);
//         }
//     }
// }

import java.util.Scanner;
public class p22_recursive_small_array{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int product=1;
            System.out.print("Enter five integers: ");
            int[] list = new int[5];
            for (int i = 0; i < list.length; i++)
            {
                list[i] = input.nextInt();
                product *= list[i];
            }
            System.out.println("The Product of elements is " + product);
        }
    }
}

