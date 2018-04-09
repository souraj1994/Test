
public class Constractor {
	
	int n,i,r,p,ou;
	String s;
	Constractor(int a,String y){
		n=a;
		s=y;
	}
	Constractor(int a,String y,int p){
		n=a;
		s=y;
		i=p;
	}
	
	void display(){System.out.println(n+" "+s+" "+i);}

	public static void main(String[] args) {
		
		Constractor c1=new Constractor(100,"ram");
		Constractor c2=new Constractor(100,"Ram",90);
		c1.display();
		c2.display();
		}
	}


