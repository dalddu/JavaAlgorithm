package com.likelion.KthNum;
import java.util.PriorityQueue;

public class KthNum {

    // array 이용하는 방법
    private int[] arr = {};

    // sort를 따로 쓰지 않아도 됨. Priority가 자동으로 정렬을 해주기 때문
    public int getKthNum(int[] command) {
        int frIdx = command[0];     // 0번 from
        int toIdx = command[1];     // 1번 to
        int nth = command[2];       // n번째
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = frIdx-1; i < toIdx ; i++) {        // from index는 1번부터 잡기 때문에 -1 해주기
            pq.add(arr[i]);
        }

        for (int i = 0; i < nth; i++) {
            result = pq.poll();     // Stack의 pop과 같음
        }
        return result;
    }

    public int[] solution(int[] arr, int[][] commands) {
        this.arr = arr;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        KthNum kthNum = new KthNum();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        kthNum.solution(arr, commands);

    }
}