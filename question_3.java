import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

    if(N<1||N>100){System.out.println("Invalid Input");}
    else{

    for(int row=1;row<=N;row++){
        
        for(int star=1;star<=row;star++){
        
        System.out.print("*");
        }


    
    System.out.println();
}
    }


    }
    
}
