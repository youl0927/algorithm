package doIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class qu003 {
    public static void main(String[] args) throws IOException {

        //sudo
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());   //입력 값이 많으면 이걸 씀 1번째 줄을 읽어왔따는 듯

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[]S = new long[suNo+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());   //입력 값이 많으면 이걸 씀 1번째 줄을 읽어왔따는 듯

        for(int i=1; i <= suNo; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q=0; q< quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}

//백준 11659번
//S[i] = S[i-1] +A[i]