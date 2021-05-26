package internship;
import java.util.*;


class Stack{
	private long[] stkArray;
	private int top;
	private int mxsize;
	Stack(int size){
		mxsize=size;
		stkArray=new long[mxsize];
		top=-1;
		
	}
	public void push(long a) {
		if(top<mxsize-1)
		stkArray[++top]=a;
		else {
			System.out.println("StackOverflow.....");
			System.out.println("Try to pop the element or increase the size of the stack");
		}
		}
	public long pop() {
		if(top==-1) {
			System.out.println("Stack Underflow..\n Push some elements first");
			return -1;
		}
		
		return stkArray[top--] ;
	}
	
	public boolean checkEmpty() {
		if(stkArray.length==0) {
			return true;
		}
		return false;
	}
	public void check(Stack t1) {
		if(t1.top == top) {
			System.out.println("Both Stack size are equal");
			System.out.println("First Stack:");
			System.out.print("[");
			for(int i=0;i<=top;i++) {
				System.out.print(stkArray[i]+" ");
			}
			System.out.println("]");
			System.out.println("Second Stack:");
			System.out.print("[");
			for(int i=0;i<=top;i++) {
				System.out.print(t1.stkArray[i]+" ");
			}
			System.out.println("]");
			
		}
		if(t1.top ==-1 && top==-1) {
			System.out.println("Both Stack  are also empty");
		}
	
	}
}

public class Prob2 {
	
	public static void input(Stack s1, Stack s2) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. For Push: \n 2.For Pop:");
		int op=scanner.nextInt();
		if(op==1) {
			System.out.print("Enter the Element:");
			long el=scanner.nextLong();
			s1.push(el);
			s1.check(s2);
		}
		else if(op==2) {
			s1.pop();
			s1.check(s2);
		}
		
		else {
			System.out.println("Wrong Choice of Input.....");
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the size of the stack1:");
		int sz1=scanner.nextInt();
		System.out.print("Enter the size of the stack2:");
		int sz2=scanner.nextInt();
		Stack s1=new Stack(sz1);
		Stack s2=new Stack(sz2);
		
//		s1.push(1);
//		s2.push(2);
//		s1.check(s2);
		while(true) {
			System.out.println();
			int choice;
			System.out.println("1.Press 1 for operation in Stack: \n2.Press 2 for operation in stack 2:\n3.Exit");
			choice=scanner.nextInt();
			System.out.println("\n");
			if(choice==1) {
				input(s1, s2);
				
				
			}
			else if(choice == 2) {
				input(s2,s1);
			}
			else if(choice ==3) {
				System.exit(0);
			}
			else  {
				System.out.println("Wrong Choice........");
			}
			
		}
		
		
	}

}
