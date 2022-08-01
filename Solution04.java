package com.codestates.coplit;

public class Solution04 {
    public String firstCharacter(String str) {
        // TODO:
        if (str.length() == 0) return "";

        //String result ="";                                        #1 + 연산 이용
        //result += str.charAt(0);

        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));


        for(int i = 1 ; i < str.length() ; i++){
           // if (str.charAt(i) ==' ') result += str.charAt(i+1);   #1 + 연산 이용
            if (str.charAt(i) ==' ') result.append(str.charAt(i + 1));
        }

        // return result;                                            #1 + 연산 사용
        return result.toString();
    }
}


/* 레퍼런스 풀이
 if (str.length() == 0) return "";

    String[] words = str.split(" ");
    String result = "";

    for (int i = 0; i < words.length; i++) {
      result = result + words[i].charAt(0);
    }

    return result;
 */