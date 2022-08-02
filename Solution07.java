package com.codestates.coplit;

import java.util.HashMap;

public class Solution07 {
    public static void main(String[] args) {

        String[][] arr = {
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"}
        };

        HashMap<String, String> output = convertListToHashMap(arr);

        System.out.println(output);
    }

    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:

        HashMap<String, String> result =new HashMap<String , String>();

        for (int i = 0 ; arr.length  > i ; i++)
            if (arr[i].length == 2 && !result.containsKey(arr[i][0])){

            result.put(arr[i][0], arr[i][1]);

        }

//        System.out.println(arr[0].length);
//        System.out.println(arr[2].length);
//        System.out.println(arr[3].length);
        return result;
    }

}
