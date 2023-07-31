import java.util.Arrays;
import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] f = new String[n];
		for (int i=0;i<n;i++) {
			f[i]=sc.nextLine();
		}
		Arrays.sort(f);
		for (int i=0;i<n;i++) {
			System.out.println(f[i]);
		}
		

	}

}
