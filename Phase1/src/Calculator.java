import java.util.*;
class Calc{
	int x,y;
	Calc(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	int add() {
		return x+y;
	}
	int sub() {
		return x-y;
	}
	int mul() {
		return x*y;
	}
	int div() {
		return x/y;
	}
}
public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn =new Scanner(System.in);
		System.out.println("Enter First Digit");
		int x=sn.nextInt();
		System.out.println("Enter Second Digit");
		int y=sn.nextInt();
		System.out.println("Enter operator(+,-,*,/)");
		String op=sn.next();
		int z=0;
		Calc o=new Calc(x,y);
		switch(op) {
		case "+":
			z=o.add();
			break;
		case "-":
			z=o.sub();
			break;
		case "*":
			z=o.mul();
			break;
		case "/":
			z=o.div();
			break;
		default:
			System.out.println("Invalid");
		}
		System.out.println(x + op + y +"=" +z);
	}
}
