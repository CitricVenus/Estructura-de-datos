
public class StackManager {
	String[]stack= new String [10];
	private int top;
	public StackManager(String [] input) {
		stack=input;
		top=0;
	}
	public void push(String s) throws Exception{
		
		if(top<stack.length) {
			stack[top]=s;
			top++;
		}
		else 
			throw new Exception ("Stack Overflow");
	}
	
	public String pop() {
		String result=null;
		if(top<stack.length) {
			result=stack[top-1];
			top--;
		}
		return result;
	}
	public String top() {
		
		return null;
	} 
	
	
	
	
	
	public static void main (String []args) throws Exception{
		String test[]= {"","","","","","","","","",""};
		StackManager stacker=new StackManager(test);
		stacker.push("o");
		stacker.push("l");
		stacker.push("l");
		stacker.push("e");
		stacker.push("h");
		System.out.println();
	}
}

