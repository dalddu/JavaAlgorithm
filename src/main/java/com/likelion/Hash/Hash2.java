package com.likelion.Hash;

import java.util.HashMap;
import java.util.Map;

public class Hash2 {
    
    /*
    1. hashmap의 key와 value 이용하기
    2. 어떻게? 참가자들 목록을 key에 넣기
     */
    /*
    1. HashMap memo에 Participant를 모두 넣을 때 1로 초기화
    2. completion에 들어있는 이름을 key로 HashMap에 검색
    3. 있으면 0으로 check
    4. memo를 한바퀴 돌면서 1인 값을 찾는다
    5. participant에 1명이 남으면 그 1명을 return
     */
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        for(int i=0; i<participant.length; i++){
            String key = participant[i];
            if(!memo.containsKey(key)){
                memo.put(key, 0);
            }
            memo.put(key, memo.get(key)+1);
        }
        for(int i=0; i<completion.length; i++){
            String key = completion[i];
            memo.put(key, 0);
        }
        for(String key:memo.keySet()){
            if(memo.get(key)==1){
                return key;
            }
        }
        return "";
    }
    }
