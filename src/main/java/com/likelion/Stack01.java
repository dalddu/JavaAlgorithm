package com.likelion;
import java.util.EmptyStackException;

public class Stack01 {
    private Integer[] arr; // int[] 0
    private int top = 0;

    public Stack01() {
        this.arr = new Integer[10000];
    }

    public Stack01(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }
    public void push(int value) {
        // 10을 넣으면 arr[0] = 10
        this.arr[this.top++] = value;
//        this.top++;
    }

    public int pop() {
        if(this.isEmpty()){
            throw new RuntimeException("스택이 비었습니다.");
        }
        return this.arr[--this.top];        // 한줄로 끝내기
        /*
        int value = this.arr[this.top-1];// this.top = 2
        this.top --;
        return value;
        */
    }

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }
    public int peek() {
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[this.top-1];
    }
}
