//package algo_new;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Bak12891 {
//
//    private static int myArr[];
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        int s = Integer.parseInt(st.nextToken());
//        int p = Integer.parseInt(st.nextToken());
//        int result = 0;
//        int checkArr[] = new int[4];
//        myArr[] = new int[4]
//        char a[] = new char[s];
//        int checkSecret = 0;
//
//        a = bf.readLine().toCharArray();
//        st = new StringTokenizer(bf.readLine());
//
//        for(int i = 0; i < 4; i++){
//            checkArr[i] = Integer.parseInt(st.nextToken());
//            if(checkArr[i]  == 0){
//                checkSecret++;
//            }
//        }
//
//        for(int i = 0; i < p; i++){
//            add(a[i]);
//        }
//    }
//
//    private void add(char c){
//        switch (c) {
//            case 'A':
//                myArr[]
//            case 'C':
//            case 'G':
//            case 'T':
//        }
//    }
//}
//
///*
//s(문자열 크기) P(부분 문자열의 크기)
//A(문자열 데이터)
//checkArr(비밀번호 채크 배열)
//// 변수 선언
//myArr(현재 상태 배열)
//checkSecret(몇 개의 문자와 관련된 개수를 충족했는지 판단하는 변수)
//P 범위(0~P-1)만큼 S배열에 적용하고, 유효한 비밀번호인지 판단하기
//for(i를 P에서 S까지 반복){
//    j선언 (i-P)
//    //이 부분은 함수로 별도 구현하기(?)
//}
// */