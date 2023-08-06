import java.util.Scanner;

public class BJ1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[26] ;

        String str = sc.next();
        str = str.toUpperCase();

        for(int i = 0; i<str.length(); i++){
            int seq = str.charAt(i) - 'A';
            array[seq]++;
        }

        int max = 0;
        int max_seq = 0;
        for(int j=0; j<array.length; j++){
            if(max < array[j]){
                max = array[j];
                max_seq = j;
            }
        }
        int check = 0;
        for(int k=max_seq+1; k<array.length; k++){
            if(array[k] == max){
                check = 1;
                break;
            }
        }

        if(check == 1){
            System.out.println("?");
        }
        else{
            max_seq = max_seq + 65;
            System.out.println((char)max_seq);        }
    }
}



