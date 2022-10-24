package com.likelion.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SolveBracket {


    /* replace() 이용
    public boolean solution(String s) {

        while (s.indexOf("()") >= 0) {
            s = s.replace("()", "");
        }
        return s.length() == 0;
        }
        */

        /*
        System.out.println(s);
        System.out.println(s.indexOf("()"));
        // "()" 이 문자열이 처음 등장하는 index
        s = s.replace("()","");
        System.out.println(s);
        System.out.println(s.indexOf("()"));
        */

    /* split() 이용
    public boolean solution(String s) {
        String[] splitted = s.split("\\(\\)");
        System.out.println(Arrays.toString(splitted));

        return s. length() == 0;
    }
    */

    /* join으로 풀기
    public boolean solution(String s) {
        while(s.indexOf("()") >= 0){
            String[] spliltted = s.split("\\(\\)");
            s = String.join("", splitted);
        }
        return s.length() == 0;
    }
    */

    
    // Stack으로 풀기
    public boolean solution(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if('(' == s.charAt(i)) {
                st.push(s.charAt(i));
            } else if(')' == s. charAt(i)){
                if(st.empty()) return false;
                st.pop();
            }
        }
        return st.empty();
    }
}
