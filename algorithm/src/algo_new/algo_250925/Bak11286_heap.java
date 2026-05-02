package algo_new.algo_250925;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.PriorityQueue;

public class Bak11286_heap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            //절댓값 작은 데이터 우선
            //절대값이 같은 경우 음수 우선
            int firstAbs = Math.abs(o1);
            int secondeAbs = Math.abs(o2);
            if(firstAbs == secondeAbs){
                return o1 > o2 ? 1 : -1;
            }

            return secondeAbs-firstAbs;
        });

        for(int i=0; i < n; i++){
            int request = Integer.parseInt(br.readLine());
            if(request ==0){
                if(myQueue.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(myQueue.poll());
                }
            }else {
                myQueue.add(request);
            }
        }
    }
}

/*
1, x=0일때 큐가 비어 있을때는 0을 출력하고 비어있지 않을때는 절댓값이 최소인 값을 출력한다. 단 절댓값이 같다면 음수를 우선으로 출력한다.
2, x=1일때 add로 큐에 새로운 값을 추가하고  우선순위 큐 정렬 기준으로 자동 정렳한다.


N(질의 요청 개수)
우선순위 큐 선언
    - 절댓값 기준으로 정렬되도록 설정한다.
    - 단, 절댓값이 같으면 음수 우선 정렬하기
for(N만큼 반복)
{
    요청이 0일때: 큐가 비어있으면 0 비어 있지 않으면 큐의 front값 출력하기(poll)
    요청이 1일 때: 새로운 데이터를 우선순위 큐에 더하기 (add)
}

 */