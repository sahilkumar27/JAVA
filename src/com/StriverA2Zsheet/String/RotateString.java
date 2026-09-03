package com.StriverA2Zsheet.String;

public class RotateString {


    public boolean rotateString(String s, String goal) {

        //Strings must be same length to be rotations of each other
        if (s.length() != goal.length()) {
            return false;
        }

//        //Try all possible rotations of s {BRUTE FORCE APPROACH}
//        for (int i = 0; i < s.length(); i++) {
//            String rotated = s.substring(i) + s.substring(0, i);
//            if (rotated.equals(goal)) {
//                //Return true if a match is found
//                return true;
//            }
//        }
//        return false;


        //Concatenate s with itself and check if goal is a substring of the concatenated string {OPTIMAL APPROACH}
        String concatenated = s + s;

        //Check if the goal is a substring of the concatenated string
        return concatenated.contains(goal);
    }

    public static void main(String[] args) {
        RotateString r = new RotateString();
        String s = "rotation";
        String goal = "tationro";
        boolean result = r.rotateString(s, goal);
        System.out.println(result);
    }
}
