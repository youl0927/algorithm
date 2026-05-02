package algo_new.algo_250925;

import java.util.Scanner;

public class Bak2750_bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i < n; i++){
            a[i] = sc.nextInt();
        }
        //여기에서 버블정렬 시작
        for(int i=0; i < n-1; i++){
            for(int j=0; j < n-1-i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int i : a){
            System.out.println(i);
        }
    }
}

/*
N(정렬할 수 개수)
A(정렬할 배열 선언)
for(i:0 ~ N -1){
    현재 A 배열의 값보다 1칸 오른쪽 배열의 값이 더 작으면 두 수 바꾸기
}
A 배열 출력
 */