package com.company;

import java.io.File;

public class Fælleskodning {

    public int pow(int x, int n) {
        if (n == 0)
            return 1;
        else
            return x * pow(x, n - 1);
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) //base case
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        else
            return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static long getSize(File file) {
        long size = 0; //store the total size of all files

        if (file.isDirectory()) {
            File[] files = file.listFiles(); //all files and subdirectories
            for (int i = 0; files != null && i < files.length; i++) {
                System.out.println(files[i]);
                size += getSize(files[i]);
            }
        } else {
            size += file.length();
        }
        return size;
    }
}
