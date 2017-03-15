import java.util.*;

import java.io.*;
import java.math.*;

interface Doing{
    String dof();

}

public class Learn {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();

        S = S.replaceAll("\\d|\\s", "");
        System.out.println(S);

        String U = S.toUpperCase();

        String st = "";

        for (int i = 0; i <S.length(); i++) {

            if (Character.isAlphabetic(S.charAt(i)) && S.charAt(i) == U.charAt(i)) st+=S.charAt(i);
        }

        System.out.println(st);
    }
}