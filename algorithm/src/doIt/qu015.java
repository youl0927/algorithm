package doIt;

import java.util.Scanner;

public class qu015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
        }
        //버블 정렬을 구현하는 영역
        for(int i=0; i < N-1; i++){
            for(int j=0; j<N-1-i; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        for(int i=0; i< N; i++){
            System.out.println(A[i]);
        }
    }
}

//백준 2750번

/*
    N(정렬할 수 개수)
    A(정렬할 배열 선언)
    for(i : 0 ~ N - 1){                                             -> loop 개수
        for(j:0 ~ N -1 -i){                                         -> 정렬하는 범위, 아직 정렬되지 않는 배열에 영역
            현재 A 배열의 값보다 1칸 오른쪽 배열의 값이 더 작으면 두 수 바꾸기    -> 인접한 배열의 값
        }
    }
    A 배열 출력
 */