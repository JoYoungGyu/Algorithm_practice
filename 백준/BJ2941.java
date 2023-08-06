import java.util.Scanner;

public class BJ2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        str = str.replaceAll("c=","a");
        str = str.replaceAll("c-","a");
        str = str.replaceAll("dz=","a");
        str = str.replaceAll("d-","a");
        str = str.replaceAll("lj","a");
        str = str.replaceAll("nj","a");
        str = str.replaceAll("s=","a");
        str = str.replaceAll("z=","a");

        System.out.println(str.length());
    }
}


