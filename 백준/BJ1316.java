import java.util.*;
import java.util.Arrays;

public class BJ1316 {
    public static int findAllIndex(String word , String document){
        List<Integer> indexList = new ArrayList<>();

        int index = document.indexOf(word);
        while (index != -1){
            indexList.add(index);
            index = document.indexOf(word , index+word.length());
        }
        int check = 0;
        for(int i=0; i<indexList.size()-1; i++){
            if(indexList.get(i+1) - indexList.get(i) != 1){
                check = 1;
            }
        }
        return check;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
           String str =  sc.next();
           String str2 = str;
           String[] str_array = str2.split("");
           String[] new_Str_Array = Arrays.stream(str_array).distinct().toArray(String[]::new);

           boolean check2 = true;
            for(int j=0; j< new_Str_Array.length; j++){
                if(findAllIndex(new_Str_Array[j], str) == 1){
                    check2 = false;
                    break;
                }
            }
            if(check2) count++;
        }
        System.out.println(count);
    }
}


