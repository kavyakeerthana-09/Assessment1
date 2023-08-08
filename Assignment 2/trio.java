import java.util.Scanner;

interface MenuItem{
	
}
class sandwich implements MenuItem{
	String sname;
	float sprice;
}
class salad implements MenuItem{
	String  qname;
	float qprice;
}
class drinks implements MenuItem{
	String dname;
	float dprice;
}
public class trio implements MenuItem{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	sandwich o1 = new sandwich();
	float price;
	System.out.println("Enter Sandwich name and price");
	o1.sname=sc.next();
	o1.sprice=sc.nextFloat();
	
	salad o2 = new salad();
	System.out.println("Enter salad name and price");
	o2.qname=sc.next();
	o2.qprice=sc.nextFloat();
	
	drinks o3 = new drinks();
	System.out.println("Enter drinks name and price");
	o3.dname=sc.next();
	o3.dprice=sc.nextFloat();
	
	//trio o4 = new trio();
	if (o1.sprice>o2.qprice && o3.dprice>o2.qprice) {
		price=o1.sprice+o3.dprice;
		System.out.println(o1.sname+"/"+o2.qname+"/"+o3.dname+"Trio");
		System.out.println("Price "+price+"$");
	}
	else if (o1.sprice>o3.dprice && o2.qprice>o3.dprice) {
		price=o1.sprice+o2.qprice;
		System.out.println(o1.sname+"/"+o2.qname+"/"+o3.dname+"Trio");
		System.out.println("Price "+price+"$");
	}
	else if (o2.qprice>o1.sprice && o3.dprice>o1.sprice) {
		price=o2.qprice+o3.dprice;
		System.out.println(o1.sname+"/"+o2.qname+"/"+o3.dname+"Trio");
		System.out.println("Price "+price+"$");
	}
	}
}

