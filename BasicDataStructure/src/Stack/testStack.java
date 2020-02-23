package Stack;

import java.util.Stack;

public class testStack {
	
	/**
	 * 利用自定义栈实现字符串逆序
	 * https://www.cnblogs.com/ysocean/p/7911910.html
	 */
	public void testStack1() {
		StackByLinkedList<Object> sbll = new StackByLinkedList<Object>();
		String str = "How are you";
		for (int i = 0; i < str.length(); i++) {
			sbll.push(str.toCharArray()[i]);
		}
		while (!sbll.isEmpty()) {
			System.out.print(sbll.pop());
		}
	}
	
	/**
	 * 利用栈判断分隔符是否匹配（Stack类）
	 * https://www.cnblogs.com/ysocean/p/7911910.html
	 */
	public void testStack2() {
		Stack<Object> stack = new Stack<Object>();
		
		String str = "12<a[b{c}]>";
		char[] cha = str.toCharArray();
		
		for(char c : cha){
	        switch (c) {
	        case '{':
	        case '[':
	        case '<':
	            stack.push(c);
	            break;
	        case '}':
	        case ']':
	        case '>':
	            if(!stack.isEmpty()){
	                char ch = stack.pop().toString().toCharArray()[0];
	                if(c=='}' && ch != '{'
	                    || c==']' && ch != '['
	                    || c==')' && ch != '('){
	                    System.out.println("Error:"+ch+"-"+c);
	                }
	            }
	            break;
	        default:
	            break;
	        }
	    }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testStack ts = new testStack();
		ts.testStack1();
		ts.testStack2();
	}

}
