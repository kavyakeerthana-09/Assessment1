import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int s=0;
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		ArrayList<Integer> lis = new ArrayList<Integer>();
		for (int i=0;i<n-1;i++) {
			s=0;
			s+=a[i];
			for (int j=i+1;j<n;j++) {
			    s=s+a[j];
			    //System.out.println(s);
			    lis.add(s);
			}
		}
		System.out.println(Collections.max(lis));
		

	}

}
