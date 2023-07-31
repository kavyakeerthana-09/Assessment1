import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a= new int[n];
		int i=0,s=0,f=0;
		for (int k=0;k<n;k++) {
			a[k]=sc.nextInt();
		}
		while(i<=n) {
			if (a[i]>=n) {
				System.out.println(s);
				break;
			}
			for (int j=i;j<i+a[i];j++) {
				s+=1;
				if (a[j]>=n-j) {
					System.out.println(s-1);
					f=1;
					break;
				}
				}
			i=i+a[i];
			if (f==1) {
				break;
			}
		}
		

	}

}
