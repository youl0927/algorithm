package algo_new;

import java.util.Scanner;

public class Bak2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int startIndex = 1;
        int endIndex = 1;

        int sum = 1;

        while(endIndex != N){
            if(sum == N){
                count++;
                endIndex++;
                sum = sum + endIndex;
            } else if (sum > N) {
                sum = sum - startIndex;
                startIndex++;
            }else {
                endIndex++;
                sum = sum + endIndex;
            }
        }
        System.out.println(count);
    }
}

/*
 N 변수 저정
 사용 변수 초기와 (count = 1, start-index = 1, end_index = 1, sum = 1)
    while(end_index != N){
        if(sum == N) count 증가, end_index 증가, sum값 변경
        else if(sum > N) sum값 변경, start_index 증가
        else if(sum < N) end_index증가, sum값 변경
    }
    count 출력하기
 */