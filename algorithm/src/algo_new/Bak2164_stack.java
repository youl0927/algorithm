package algo_new;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bak2164_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=1; i <= n; i++){
            myQueue.add(i);
        }

        while(myQueue.size() > 1){
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.poll());
    }
}
/*
N(카드 개수) myQueue(카드 저장 자료구조)
for(카드의 개수만큼 반복){
    큐에 카드 저장하기
}
while(카드가 1장남을때까지){
    맨 위의 카드를 버림 : poll()
    맨 위의 카드를 가장 아래로 카드 밑으로 이동: poll() -> add()
}
마지막으로 남은 카드 출력
 */