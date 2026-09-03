package com.StriverA2Zsheet.String;

public class RotateString {


    public boolean rotateString(String s, String goal) {

        //Strings must be same length to be rotations of each other
        if (s.length() != goal.length()) {
            return false;
        }

        //Try all possible rotations of s
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                //Return true if a match is found
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        RotateString r = new RotateString();
        String s = "rotation";
        String goal = "tationro";
        boolean result = r.rotateString(s, goal);
        System.out.println(result);

    }
}
