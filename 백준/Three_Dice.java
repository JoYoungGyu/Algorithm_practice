
/*
* 백준 2480번 주사위 세개
* IF_ELSE문으로 분기해서 품
* 뭔가 너무 하드코딩으로 푼 듯한 느낌...
* */
import java.util.*;
public class Three_Dice {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int dice1, dice2, dice3; // 주사위 1, 주사위 2 , 주사위 3
            int max = 0;
            int price;
            dice1 = sc.nextInt();
            dice2 = sc.nextInt();
            dice3 = sc.nextInt();

            if(dice1 == dice2 && dice1==dice3){
                    price = 10000+dice1*1000;
            }else if(dice1 == dice2 && dice1!=dice3){
                    price = 1000 + dice1*100;
            }else if(dice1 == dice3 && dice1!=dice2){
                    price = 1000 + dice1*100;
            }else if(dice2==dice3 && dice2 != dice1){
                    price = 1000 + dice2*100;
            }else{
                if(dice1>max){
                    max = dice1;
                }
                if(dice2>max){
                    max = dice2;
                }
                if(dice3>max){
                    max = dice3;
                }
                price = max*100;
            }
            System.out.println(price);
        }
    }


