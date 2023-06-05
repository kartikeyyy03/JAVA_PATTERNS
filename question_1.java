import java.util.Scanner;

public class question_1{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        if(N<2||N>100){System.out.println("Invalid input");}
        else{

        for(int i=1;i<=N;i++){

            System.out.print("*");
        }



    }
}




}