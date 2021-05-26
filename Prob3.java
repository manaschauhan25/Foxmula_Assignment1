package internship;
import java.util.*;



class Quadrilateral{
	int x1,y1,x2,y2,x3,y3,x4,y4;
	double a,b,c,d;
	public Quadrilateral(int x1, int y1, int x2,int y2, int x3, int y3 , int x4, int y4) {
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.x4=x4;
		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
		this.y4=y4;
		
		
	}
	
}
class Trapezoid extends Quadrilateral{
	public Trapezoid(int x1, int y1, int x2,int y2, int x3, int y3 , int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		a=Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
		b=Math.sqrt(Math.pow(Math.abs(x4-x1),2)+Math.pow(Math.abs(y4-y1),2));
		c=Math.sqrt(Math.pow(Math.abs(x2-x3),2)+Math.pow(Math.abs(y2-y3),2));
		d=Math.sqrt(Math.pow(Math.abs(x3-x4),2)+Math.pow(Math.abs(y3-y4),2));
		
	}
	double area() {
		
		float m;
		double ar=0;
		
		if(x1>x4) {
			
			
			m=(y4-y3)/(x4-x3);
			float x=(x1+m*y1+m*m*x3-m*y3)/(1+m*m);
			float y=(y3+m*x1-m*x3+m*m*y1)/(1+m*m);
			double height=Math.sqrt(Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2));
			
			ar=((a+d)*height)/2;
		}
			else if(x4>x1) {
				
			
			m=(y1-y2)/(x1-x2);
			float x=(x4+m*y4+m*m*x2-m*y2)/(1+m*m);
			float y=(y2+m*x4-m*x2+m*m*y4)/(1+m*m);
			double height=Math.sqrt(Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2));
			System.out.print("++"+x);
			ar=((a+d)*height)/2;
			}
		return ar;
		
	}
	
}
class Parallelogram extends Quadrilateral{
	public Parallelogram(int x1, int y1, int x2,int y2, int x3, int y3 , int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		a=Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
		b=Math.sqrt(Math.pow(Math.abs(x4-x1),2)+Math.pow(Math.abs(y4-y1),2));
		c=Math.sqrt(Math.pow(Math.abs(x2-x3),2)+Math.pow(Math.abs(y2-y3),2));
		d=Math.sqrt(Math.pow(Math.abs(x3-x4),2)+Math.pow(Math.abs(y3-y4),2));
	}
	double area() {
		double base;
		float m;
		double ar=0;
		
		
		if(x1>x4) {
			
			
			base=d;
			m=(y4-y3)/(x4-x3);
			float x=(x1+m*y1+m*m*x3-m*y3)/(1+m*m);
			float y=(y3+m*x1-m*x3+m*m*y1)/(1+m*m);
			double height=Math.sqrt(Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2));
			
			ar=base*height;
		}
			else if(x4>x1) {
				
			base=a;
			m=(y1-y2)/(x1-x2);
			float x=(x4+m*y4+m*m*x2-m*y2)/(1+m*m);
			float y=(y2+m*x4-m*x2+m*m*y4)/(1+m*m);
			double height=Math.sqrt(Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2));
			System.out.print("++"+x);
			ar=base*height;
			}
			
			else if(x1==x4 && y1==y2 && x2==x3 && y3==y4) {
				ar=a*b;
			}
		
		return ar;
	
	
}
}
class Rectangle extends Quadrilateral{
	public Rectangle(int x1, int y1, int x2,int y2, int x3, int y3 , int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		a=Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
		b=Math.sqrt(Math.pow(Math.abs(x4-x1),2)+Math.pow(Math.abs(y4-y1),2));
		c=Math.sqrt(Math.pow(Math.abs(x2-x3),2)+Math.pow(Math.abs(y2-y3),2));
		d=Math.sqrt(Math.pow(Math.abs(x3-x4),2)+Math.pow(Math.abs(y3-y4),2));
	}
	double area() {
		return a*b;
	}
	
}
class Square extends Quadrilateral{
	public Square(int x1, int y1, int x2,int y2, int x3, int y3 , int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		a=Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
		b=Math.sqrt(Math.pow(Math.abs(x4-x1),2)+Math.pow(Math.abs(y4-y1),2));
		c=Math.sqrt(Math.pow(Math.abs(x2-x3),2)+Math.pow(Math.abs(y2-y3),2));
		d=Math.sqrt(Math.pow(Math.abs(x3-x4),2)+Math.pow(Math.abs(y3-y4),2));
	
	}
	double area() {
		return a*a;
	}
}


public class Prob3 {
	public static void main(String[] args) {
		
		System.out.println("'''Assuming that top left is (x1,y1) the top right (x2,y2) bottom left is (x3,y3) bottom right is (x4,y4)''' ");
		
		Square square= new Square(0,2,2,2,2,0,0,0);
		Rectangle rect= new Rectangle(0,2,3,2,3,0,0,4);
		Parallelogram parl=new Parallelogram(7,5,16,5,9,0,0,0);
		Trapezoid trapezoid=new Trapezoid(-2,2,2,2,6,0,-6,0);
		
		
		System.out.println();
		System.out.println("Area of Square:"+square.area());
		System.out.println();
		System.out.println("Area of Rectangle:"+rect.area());
		System.out.println();
		System.out.println("'''Assumption Paralleogram can be made only by changing x1 and x4 not considering for y1 and y2''' ");
		System.out.println("Area of Paralleogram:"+parl.area());
		System.out.println();
		System.out.println("'''Assumption in Trapazious parallel sides can be on up or down but not on left and right''' ");
		System.out.println("Area of Trapazoid:"+trapezoid.area());
		
		
		
	}
}


