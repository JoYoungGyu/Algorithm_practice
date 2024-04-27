package me.joyeonggyu;

/*
* 2차원 배열 선택정렬
* 2 demesion selectedSort
* */

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{

    public static int[][] arr ={
            {9,20,2,18,11},
            {19,1,25,3,21},
            {8,24,10,17,7},
            {15,4,16,5,6},
            {12,13,22,23,14}
    };

    public static int[][] sortArr = new int[5][5];
    int curMin = -1;
    int x,y;
    int newX=0, newY=0;

    int dx[] = {1,0,-1,0};
    int dy[] = {0,1,0,-1};
    int dir_stat=0;

    public static int sel_min(int p_arr[][]){
        int min = 0;
        int minX =0;
        int minY =0;

        min = arr[0][0];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(min > arr[i][j]){
                    min = arr[i][j];
                    minX = i; minY=j;
                }
            }
        }
        arr[minX][minY];
        return min;
    }

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    }
}
