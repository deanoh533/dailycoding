package com.codestates.coplit;

public class Solution08 {
// 문제 : 문자열을 입력받아 해당 문자열에 등장하는 두 칸의 공백을 모두 한 칸의 공백으로 바꾼 문자열을 리턴해한다.
// 조건 : 두칸을 초과하는 공백은 존재하지 않는다.
    public static void main(String[] args) {

        String output = convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output);
    }

    private static String convertDoubleSpaceToSingle(String s) {
        StringBuilder sb = new StringBuilder();

        sb.append(s);

        for (int i = 0 ; sb.length()>i ; i++){
           if( sb.charAt(i) == ' ' && sb.charAt(i+1) == ' '){
               sb.delete(i,i+1);
           }
        }

        return sb.toString();



    }


}
