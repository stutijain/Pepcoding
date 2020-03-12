package numbersystem;

public class Octal2BinDirect {

	public static void main(String[] args) {
		int n=527;
		int power=1;//1000^0
		int oct=0;
		while(n != 0){
			int rem=n%10;
			n=n/10;
			
			switch(rem){
			case 0:
				rem=0;
				break;
			case 1:
				rem=1;
				break;
			case 2:
				rem=10;
				break;
			case 3:
				rem=11;
				break;
			case 4:
				rem=100;
				break;
			case 5:
				rem=101;
				break;
			case 6:
				rem=110;
				break;
			case 7:
				rem=111;
				break;
			default:
				break;
			}
			oct=oct+rem*power;
			power=power*1000;
		}
		System.out.println(oct);

	}

}
