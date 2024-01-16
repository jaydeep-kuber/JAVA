import java.util.Random;

public class p11_6x6_metrix {

    static int[][] getMetrix(int[][] mt){
        Random rn=new Random();

        for(int i=0;i<6;i++){
          for(int j=0 ; j<6;j++){
            int num=rn.nextInt(0,2);
            mt[i][j]=num;
           }
        }
        return mt;
    }

    static int[][] display(int[][] dMt){

     for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                System.out.print(" " + dMt[i][j]);
            }
            System.out.println(" ");
        }
        return dMt;

    }
    public static void main(String[] args) {
        int[][]metrix66= new int[6][6];

        getMetrix(metrix66);
        display(metrix66);

        System.out.println("------------Odd Rows-------------");
        // row
        for(int a=0;a<6;a++){
            int count=0;
            for(int b=0;b<6;b++){
                if(metrix66[a][b]==1){
                    count++;
                }
            }
            if(count%2!=0){
                    System.out.print((a+1));
                    System.out.print(" || ");
                }

        }
        System.out.println(" ");
        System.out.println("------------Odd Columns-------------");
        //col
        for(int a=0;a<6;a++){
            int count=0;
            for(int b=0;b<6;b++){
                if(metrix66[b][a]==1){
                    count++;
                }
            }
            if(count%2!=0){
                    System.out.print((a+1));
                    System.out.print(" || ");
                }

        }

    }
}
