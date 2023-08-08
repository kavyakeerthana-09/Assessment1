import java.util.Scanner;

interface AdvancedArithmetic{
	void divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{

	static int sum;
	@Override
	public void divisor_sum(int n) {
		// TODO Auto-generated method stub
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}
	
}
public class ques1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		MyCalculator o = new MyCalculator();
		o.divisor_sum(n);

	}

}
