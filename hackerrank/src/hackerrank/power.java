package hackerrank;
import java.util.Scanner;

public class power {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int q=scn.nextInt();
        while(q!=0){
            double dia=scn.nextInt();
            int k=scn.nextInt();
            int r=(int)Math.sqrt(dia);
            int count=0;
            for(int x=-r;x<=r;x++){
                for(int y=-r;y<=r;y++){
                    if(x*x + y*y == dia) count++;
                } 
            }
            System.out.println(count);
            if(k>=count) System.out.println("possible");
            else System.out.println("impossible");
            q--;
        }
    }

}
