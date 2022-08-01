package com.codestates.coplit;

public class Solution06 {

    public static void main(String[] args) {


//        String output1 = letterCapitalize("hello world");
//        System.out.println(output1); // "Hello World"
//        String output2 = letterCapitalize("java  is good ");
//        System.out.println(output2); // "Java  Is Good"
        String output2 = letterCapitalize("      ");
        System.out.println(output2); // "Java  Is Good "
    }


    public static String letterCapitalize(String str) {
        // TODO:

        if (str.length() == 0){return null;}

        StringBuilder sb = new StringBuilder();

        while(str.charAt(0) == ' '){

            str = str.substring(1);
            if(str.equals(" ")) {return "";}
        }

        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; str.length() > i; i++) {

            if (str.charAt(i-1) == ' ') {
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
//        if (str.length() == 0) return null;
//
//        temp = str.split(" ");
//
//        for (int i = 0 ; i<temp.length ; i ++){
//
//            String alter = null;
//            StringBuilder sb = new StringBuilder();
//            sb.append(temp[i]);
//           alter = String.valueOf(Character.toUpperCase(temp[i].charAt(0)));
//            sb.replace(0, 1, alter);
//            str = sb.toString();


            //  }



        }
        return sb.toString();
    }
}



