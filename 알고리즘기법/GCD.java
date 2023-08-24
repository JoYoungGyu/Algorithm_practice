import java.util.*;

public class GCD {
        public static int GCD(int a, int b){
            if(a%b==0){
                return b;
            }
            return GCD(b,a%b);
        }
    public static void main(String[] args){
            System.out.println(GCD(192,162));
        }
    }



