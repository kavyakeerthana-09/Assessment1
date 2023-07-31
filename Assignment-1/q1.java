import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a distance between 5km to 8km"+" ");
		int d=sc.nextInt();
		int f=0,d1;
		while(d!=-1) {
			if (d<5 || d>8) {
			System.out.println("Sorry, Choose between 5km to 8km");
			System.out.print("Enter a distance between 5km to 8km"+" ");
			d1=sc.nextInt();
			f=0;
			d=d1;
			}
			else {
				f=1;
				break;
			}
		}
		if (f==1 && (d>=5 && d<=8)) {
			System.out.println("Distance to run:"+d);
			for (int i=d-1;i>=0;i--) {
				if (i==d-1) {
					System.out.println("Distance to run:"+i);
					System.out.println("Good start ,keep it up");
				}
				else if (i==2 || i==1) {
					System.out.println("Distance to run:"+i);
					System.out.println("Almost there");
				}
				else if (i==0) {
					System.out.println("Done for the day");
				}
				else {
				System.out.println("Distance to run:"+i);
				}
			}
		}else {
			System.out.println("Sorry, Choose between 5km to 8km");
		}
		

	}

}
