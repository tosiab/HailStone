import java.util.*;
public class hailStone{
    public static void main(String[]args){
        int m = 0;
        int b = 0;
        for (int i = 1; i<=200; i++){
            int iter = 0;
            int num = i;
            while (num !=4){
                iter += 1;
                if ((num % 2) == 0){
                    num /= 2;
                }
                else{
                    num *= 3;
                    num += 1;
                }
            }
            if(iter>b){
                b=iter;
                m=i;
            }

        }
        System.out.println("The most iterations was "+b);
        System.out.println("The number which made this maximum is "+m);

    }
}
