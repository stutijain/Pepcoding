package numbersystem;
import java.util.Scanner;

public class Dec2Base {

	public static void main(String[] args) {
		//any base to any base
		Scanner scn=new Scanner(System.in);
		System.out.println("enter source base");
		int sb=scn.nextInt();
		System.out.println("enter destination base");
		int db=scn.nextInt();
		System.out.println("enter the number");
		int n=scn.nextInt();
		convert2dec(n, sb,db);
	}
	//only for bases below 10->decimal to any base
	public static int convert(int n,int base){
		int bin=n;
		int dec=0;
		int power=1;
		while(bin>0){
			int rem=bin%base;
			bin=bin/base;
			dec=dec+rem*power;
			power=power*10;
		}
		return dec;
	}
	public static void convert2dec(int n,int sb,int db){
		int bin=n;
		int dec=0;
		int power=1;
		while(bin>0){
			int rem=bin%10;
			bin=bin/10;
			dec=dec+rem*power;
			power=power*sb;
		}
		System.out.println(convert(dec,db));
	}

}
