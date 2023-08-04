package Encapsulation;

public class ClassB  {
	public static void main(String[] args) {
		ClassA a1=new ClassA(10);
		int v=a1.getvalue();
		System.out.println(v);
		a1.setvalue(30);
		System.out.println(a1.getvalue());
	}

}
