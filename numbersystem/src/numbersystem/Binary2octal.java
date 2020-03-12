package numbersystem;

public class Binary2octal {

	public static void main(String[] args) {
		 int n=101010;
		 int bin=0;
		 int power=1;
		 while(n>0){
			 int rem=n%1000;
			 n=n/1000;
			 switch(rem){
			    case 0:
					rem=0;
					break;
				case 1:
					rem=1;
					break;
				case 10:
					rem=2;
					break;
				case 11:
					rem=3;
					break;
				case 100:
					rem=4;
					break;
				case 101:
					rem=5;
					break;
				case 110:
					rem=6;
					break;
				case 111:
					rem=7;
					break;
				default:
					break;
			 }
			 bin=bin+rem*power;
			 power=power*10;
		 }
		 System.out.println(bin);

	}

}
