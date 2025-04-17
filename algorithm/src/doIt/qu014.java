package doIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class qu014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {

            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs){    //절대값이 같은 경우 음수 우선
                return o1> o2 ? 1 : -1;
            }

            return first_abs - second_abs;  //절대값이 작은 데이터 우선
        });

        for(int i = 0; i < n; i++){
            int request = Integer.parseInt(br.readLine());

            if(request ==0){
                if(myQueue.isEmpty()){
                    System.out.println("0");
                }else {
                    System.out.println(myQueue.poll());
                }
            } else {
                myQueue.add(request);
            }
        }
    }
}

//백준 11286

/*
    n(질의 요청 개수)
    우선순위 큐 선언
    -절대값 기준으로 정렬되도록 설정하기
    -단 절대값이 같으면 음수 우선 정렬하기

    for(n만큼 반복)
    {
        요청이 0일때 : 큐가 비엉있으면 0 비어있지 않으면 큐의 front값 출력하기 (poll())
        요청이 1일때 : 새로운 데이터를 우선순위 큐에 더하기(add)
    }

 */
