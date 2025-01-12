package rmgprojecttest;

public class child extends parent {
	static int a =2;
	int b=3;
	int d;
	child(){
		//this(20);
		//child bb=new child();
		child.sum("dd", b);
		System.out.println("no parameter constructyor");
	}
	child(int b){
		child bb=new child();
		System.out.println("paramteter "+b);
	}
	public static void main(String[] args) {
		
		child ch = new child();
		System.out.println(ch);
		ch.sum(10, 20); // overriden by child
		ch.sum("", 0, 0); /// overloaded child
		ch.sum("hello", 0); // Static in child
		ch.makeSound(); // overriden by child
		ch.fetch(); // non static in child
		ch.num(0, 0); // non static parent
		System.out.println("a : "+a+" :b : "+ch.b+"d: "+ch.d);

		parent pr = new parent();
		System.out.println(pr);
		pr.sum(1, 2); // overriden by child
		pr.sum("", 0); // // Static in parent
		pr.makeSound(); // overriden by child
		pr.num(0, 0);
		System.out.println("a : "+a+" :b : "+pr.b+"d: ");

		parent cp = new child(); // upcasting
		System.out.println(cp);
		System.out.println("----------------------- Upcasting-------------------");
		cp.sum(0, 0);// overriden by child
		cp.sum("", 0); // Static in parent         (Method Shadowing)
		cp.makeSound();// overriden by child
		cp.num(0, 0); // non static parent
		System.out.println("a : "+a+" :b : "+cp.b+"d: ");

		child pc = (child) cp; // Downcasting
		System.out.println("a : "+a+" :b : "+pc.b+"d: "+pc.d);
		System.out.println(pc);
		System.out.println("---------------------  Downcasting -----------------");

		pc.sum(10, 20); // overriden by child
		pc.sum("", 0, 0); /// overloaded child
		pc.sum("hello", 0); // Static in child      (Method Shadowing)
		pc.makeSound(); // overriden by child
		pc.fetch(); // non static in child
		pc.num(0, 0); // non static parent
		
		System.out.println("d: "+ch.d);
	}

	void makeSound() {
		System.out.println("child makes sound");
		
	}

	public void fetch() {
		System.out.println("child fetch");
		System.out.println("a : "+a+" :b : "+b+"d: "+this.d);
	}

	public void sum( int a, int b) {
		System.out.println(this);
		System.out.println("Sum method of Child class");

	}

	public static void sum(String a, int b) {
		
		System.out.println("Static sum of Child");
		System.out.println("d: "+ a);
	}

	public void sum(String a, int b, int c) {
		System.out.println("overloaded child");
	}
//	public static void main(Integer[] args) {
//	System.out.println("ffff");
//}

}
