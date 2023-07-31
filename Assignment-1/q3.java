import java.util.Arrays;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int s=0,m=0,f=0;
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=n-1;i>=1;i--) {
			m+=a[i];
			for (int j=i-1;j>=0;j--) {
				s+=a[j];
			}
			if (m==s) {
				System.out.println("True");
				f=1;
				break;
			}
			s=0;
		}
		if (f==0) {
			System.out.println("False");
		}
	}

}
