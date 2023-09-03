import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        int count  = 5;
        for(int i=0; i<count; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String a = String.format("%"+count+"s", Integer.toBinaryString(n)).replace(' ','0');
            String b = String.format("%"+count+"s", Integer.toBinaryString(m)).replace(' ','0');
            String s = "";
            for(int j=0; j<count; j++){
                if( a.charAt(j) == '1' || b.charAt(j) == '1'){
                    s = s+"#";
                }else{
                    s = s+" ";
                }
            }
            str[i] = s;
            System.out.println(s);
        }
    }
}