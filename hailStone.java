import java.util.*;
public class hailStone{
    public int iter;
    public static void main(String[]args){
        for (int i = 1; i<=200; i++){
            int iter = 0;
            int num = i;
            while (num >4){
                iter += 1;
                if ((num % 2) == 0){
                    num /= 2;
                }
                else{
                    num *= 3;
                    num += 1;
                }
            }
            System.out.println(i);

        }

    }
}
