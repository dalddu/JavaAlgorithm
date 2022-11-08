package com.likelion.Prime;


import java.util.Arrays;

public class Eratosthenes {

    public void leve1() {
        for (int i = 0; i <99 ; i++) {
            System.out.printf("%d, %d\n", (i+2), (i+1)*2);
        }
    }

    public void level2() {

        // 에라토스테네스의 체 기본 세팅
        // 1. "2 ~ 원하는 범위 "의 숫자가 담긴  int[] 배열 선언
        //  2. 위에서 만든 배열과 같은 길이의 boolean[] 배열을 만들고, true로 초기화.

        // 원하는 범위
        int N = 50;

        // 1. 과정
        // N-1개 만큼. 즉, 2~50까지 총 49개의 숫자가 들어감
        int[] nums = new int[N-1];
        // nums에 2~50을 채워 넣음.
        for (int i = 0; i < nums.length; i++) {
            nums[i]=i+2;
        }

        System.out.println(Arrays.toString(nums));

        // 2. 과정
        // nums만큼 checks생성
        boolean[] checks = new boolean[nums.length];
        // checks를 true 로 초기화 (기본값 : false)
        Arrays.fill(checks,true);

        // 2의 배수 지우기
        // idx : 0 1 2 3 4 5 6 7 8 9
        // nu :  2 3 4 5 6 7 8 9 10 11

        int multipleof = 2;
        for (int i = 2 ; i < nums.length; i += 2) {
            checks[i] = false;
        }

        // checks를 참조해서  2가 지워진 배열을 출력해보자
        for (int i = 0; i < checks.length; i++) {
            if (checks[i] == true) {
                System.out.printf("%d, ", nums[i]);
            }
        }

    }

    public static void main(String[] args) {
        Eratosthenes er = new Eratosthenes();
        er.level2();
    }
}