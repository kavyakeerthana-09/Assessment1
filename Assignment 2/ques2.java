import java.util.ArrayList;
import java.util.Scanner;

public class ques2 {

	static int order(String o,String l[],int n){
		//char c;
		char c=l[0].charAt(0);
		char[] s= new char[n];
		int f=0;
		char[] s1= new char[o.length()];
		String h;
		for (int j=0;j<n;j++) {
			for(int k=0;k<o.length();k++) {
			if (l[j].charAt(0)!=o.charAt(k)) {
				for(int m=k+1;m<o.length();m++) {
					if (l[j].charAt(0)==o.charAt(m)) {
						f=1;
					}
				}
				if (f==1) {
					continue;
				}else {
					return 1;
				}
			}else if (l[j].charAt(0)==o.charAt(k)) {
				continue;
			}
		}
			}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of words");
		int n=sc.nextInt();
		String[] l= new String[n];
		for (int i=0;i<n;i++) {
			l[i]=sc.next();
		}
		System.out.println("Enter order");
		String o=sc.next();
		ques2 o1 = new ques2();
		System.out.println(o1.order(o,l,n));

}
}
	
