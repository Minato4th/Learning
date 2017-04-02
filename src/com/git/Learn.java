package com.git;

import java.util.*;

interface Doing{
    String dof();

}

class A{
    int a(int c){
        return c;
    }
}
class B extends A{
    int a(int c){
        return super.a(c);
    }
}

public class Learn {

    public static void main(String args[]) {

        char ch = 10;


        Scanner in = new Scanner(System.in);
        String S = in.nextLine();


        S = S.replaceAll("\\d|\\s", "");
        System.out.println(S);

        String U = S.toUpperCase();

        String st = "";

        for (int i = 0; i < S.length(); i++) {

            if (Character.isAlphabetic(S.charAt(i)) && S.charAt(i) == U.charAt(i)) st += S.charAt(i);
        }

        System.out.println(st);

        switch (5) {
            case 2: {
            }
            default: {
            }
            case 3: {
            }
        }

    }
}

