package com.likelion.KthNum;


import java.util.Arrays;

public class KthNumSlice {
    
    // array 이용하기
    public int[] solution(int[] arr, int[][] commands) {

        // answer 배열로 선언
        int[] answer = new int[commands.length];
        int idx = 0;

        // n번부터 m번까지 array를 자른다
        // from부터 to까지 array를 자른다
        for (int[] command :commands) {


            int[] slicedArr = Arrays.copyOfRange(arr, command[0]-1, command[1]);
            Arrays.sort(slicedArr);  // array 정렬을 한다

            // 정렬한 Array의 idx번째를 뽑는다
            // 2부터 시작하면 5가 뽑히지 않으므로 2-1을 한다
            answer[idx++] = slicedArr[command[2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        KthNumSlice kns = new KthNumSlice();
        int[] answer = kns.solution(arr, commands);
        System.out.println(Arrays.toString(answer));
    }

}