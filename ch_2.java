import java.util.Random;
import java.util.Scanner;
public class ch_2 {
    
        public static void main(String[] args) {
        //input by user
        System.out.println("your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        //random to genrated to compared
        Random rand = new Random();
        int Guess = rand.nextInt(100)+ 1;

        //no is greater or not
        if (num > Guess){
            System.out.println("greater");
        } else {
            System.out.println("lesser");
        }
        //to exit
        sc.close();
        }
    
}