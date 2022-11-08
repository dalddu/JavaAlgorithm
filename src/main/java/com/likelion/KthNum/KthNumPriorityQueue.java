package com.likelion.KthNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNumPriorityQueue {
    public int[] solution(int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            // 우선순위 큐에 from, to 까지 넣기
            for(int j=commands[i][0]-1; j<commands[i][[1]; j++){
                pq.add(arr[j]);
            }
            // 정렬이 됐기 때문에 뽑기만 한다
            for(int j=0; j<commands[i][2]; j++) {
                answer[i] = pq.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
       pq.forEach(item-> System.out.println(item));
        while(!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
