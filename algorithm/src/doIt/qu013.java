package doIt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class qu013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            myQueue.add(i);
        }

        while(myQueue.size() > 1){
            myQueue.poll();
            int temp = myQueue.poll();
            myQueue.add(temp);
        }
        System.out.println(myQueue.poll());
    }
}

//백준 2164번
/*

    n(카드의 갯수) myQueue(카드 저장 자료구조)
    for(카드의 갯수만큼 반복){
        큐에 카드 저장
    }
    while(카드가 1장 남을때 까지){
        맨위의 카드를 버림 : poll()
        맨위의 카드를 가장 아래의 카드밑으로 이동: poll() -> add()
    }

    마지막으로 남은 카드 출력

 */