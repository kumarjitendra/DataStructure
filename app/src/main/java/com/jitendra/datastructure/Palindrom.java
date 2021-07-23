package com.jitendra.datastructure;


 class Palindrom {
    // Java implementation of the above aprroach

    // Function to check palindrome
    static boolean checkPalindrome(String str) {

        // Calculating string length
        int len = str.length();

        // Traversing through the string
        // upto hlaf its length
        for (int i = 0; i < len / 2; i++) {

            // Comparing i th character
            // from starting and len-i
            // th character from end
            if (str.charAt(i) !=
                    str.charAt(len - i - 1))
                return false;
        }

        // If the above loop doesn't return then
        // it is palindrome
        return true;
    }

    // Driver Code
    public static void main(String[] args) {
        // Taking number as string
        String st = "112233445566778899000000998877665544332211";

        System.out.print("check");

        if (checkPalindrome(st))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}