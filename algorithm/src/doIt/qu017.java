package doIt;

import java.util.Scanner;

public class qu017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] a = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            a[i] = Integer.parseInt(str.substring(i, i+1));
        }
        //선택정렬
        for(int i=0; i < str.length(); i++){
            int max = i;
            for(int j=i+1; j<str.length(); j++){
                if(a[j] > a[max]){
                    max = j;
                }
            }
            if(a[i] < a[max]){
                int temp = a[i];
                a[i] = a[max];
                a[max] = temp;
            }
        }

        for(int i=0; i < str.length(); i++){
            System.out.print(a[i]);
        }
    }
}

//백준 1427번
/*
    str(정렬할 수)
    A(자리수별로 구분해서 저장한 배열)
    for(str의 길이만큼 반복하기){
        A 배열 저장 -> str.substring 사용하기
    }

    for(i:0~str의 길이만큼 반복하기){
        for(j:i +1 ~ str의 길이만큼 반복하기){
            현재 범위에서 Max값 찾기
        }
    }
    현재 i의 값과 Max값 중 Max값이 더 크면 swap 수행하기
    }
    A 배열 출력하기
*/