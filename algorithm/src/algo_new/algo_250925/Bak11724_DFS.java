package algo_new.algo_250925;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bak11724_DFS {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        A = new ArrayList[n+1];
        for(int i=1; i< n+1; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int count = 0;
        for(int i = 1; i<n; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    public static void DFS(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : A[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}

/*
n(노드 개수) m(에지 개수)
A(그래프 데이터 저장 인접 리스트)
visited(방문 기록 저장 배열)
for(n의 개수만큼 반복하기){
    A 인접 리스트의 각 ArrayList초기화
}
for(m의 개수만큰 반복하기){
    A 인접 리스트에 그래프 데이터 저장하기
}
for(n의 개수만큼 반복하기){
    if(방문하지 않는 노드가 있다면{
        연결 요서 개수++
        DFS실행하기
    }
}

DFS구현하기
DFS{
    if(현재 노드 == 방문 노드) return;
    visited 배열에 현재 노드 방문 기록하기
    현재 노드의 연결 노드 중 방문하지 않는 노드로 DFS실행하기 (재귀 함수 형태)
}
 */