import java.util.Scanner;

public class question_11 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

     if(N<2||N>100){System.out.println("Invalid Input");}
     else{

        for(int row=1;row<=N;row++){
            for(int i=1;i<=row;i++){System.out.print("*");
        }

            System.out.println();
        }

        for(int j=N-1;j>=1;j--){
            for(int k=1;k<=j;k++){System.out.print("*");}

            System.out.println();
        }
  
    }
}      
}