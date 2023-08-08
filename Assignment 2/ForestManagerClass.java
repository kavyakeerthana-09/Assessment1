import java.util.Scanner;

interface DigitalTreeInterface{
	int absorbSunlight(int h);
	int getTreeDetails();
}
class binarytree{
	
}
class quantumtree{
	
}
class neutraltree{
	
}
class ForestManager{
	int sum;
	int energy;
	int produceEnergyForForest(int h,int tree,int val,int total) {
		if (tree==0) {
			sum+=h*2;
			System.out.println("Binary energy: " + h*2);
		}
		else if (tree==1) {
			sum+=3*(Math.pow(h, 2));
			System.out.println("Quantum energy: " + (int)3*(Math.pow(h, 2)));
			
		}else if (tree==2) {
			sum+=Math.pow(h, 3);
			System.out.println("Neutral energy: " + (int)Math.pow(h, 3));
		}
		if(val==total-1) {
		getForestReport(tree,sum,val,total);
		}
		//System.out.println(sum);
		return 0;
	}
	int getForestReport(int tree,int sum,int val,int total) {
	    this.energy=sum;
	    if (val==total-1) {
		System.out.println("Total energy : "+ energy);
	    }
		return 0;
	}
}
public class ForestManagerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForestManager f = new ForestManager();
		//System.out.println(f.produceEnergyForForest(2));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of trees: ");
		int n=sc.nextInt();
		int val;
		int tree;
		for (int i=0;i<n;i++) {
			System.out.println("Enter tree name : binary-0/quantum-1/neutral-2");
			tree=sc.nextInt();
			val=i;
			f.produceEnergyForForest(2, tree,val,n);
			
		}
		

	}

}
