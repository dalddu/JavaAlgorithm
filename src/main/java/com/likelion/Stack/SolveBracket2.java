package com.likelion.Stack;

import java.util.Stack;

public class SolveBracket2 {
    public boolean solution(String s){
        Stack<String> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(String.valueOf(s.charAt(i)));
            } else if(isPair(st.peek(), String.valueOf(s.charAt(i)))){
                if(st.empty()) return false;
                st.pop();
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {

    }


}
