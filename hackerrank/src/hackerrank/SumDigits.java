package hackerrank;


import java.io.*;
import java.util.*;

public class SumDigits {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println(sum(s,0,s.length()));
    }
    public static int sum(String s,int vidx,int n){
        if(vidx == n-1) return (int)(s.charAt(0)-'0');
        int sumo=sum(s.substring(vidx+1),vidx+1,n);
        return sumo;

    }
}
