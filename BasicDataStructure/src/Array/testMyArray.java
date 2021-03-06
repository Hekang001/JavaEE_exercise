package Array;


public class testMyArray {
	
	class Student {
		private String name;
		private int score;
		public Student(String name_, int score_) {
			name = name_;
			score = score_;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", score=" + score + "]";
		}			
	}

	public static void main(String[] args) {
		
		// 泛型测试
		testMyArray t = new testMyArray();
		MyArray<Student> arr = new MyArray<testMyArray.Student>();
		arr.addLast(t.new Student("Python", 100));
		arr.addLast(t.new Student("Java", 99));
		arr.addLast(t.new Student("C++", 88));	
		System.out.println(arr.toString());		
		
		// 测试扩容
		MyArray<Integer> arr1 = new MyArray<Integer>(8);
		for (int i = 0; i < 8; i++) {
			arr1.addLast(i);
		}
		System.out.println(arr1.toString());	
		arr1.addLast(111);
		arr1.addLast(222);
		System.out.println(arr1.toString());	
		
		// 测试缩容
		MyArray<Integer> arr2 = new MyArray<Integer>(6);
		for (int i = 0; i < 6; i++) {
			arr2.addLast(i);
		}
		System.out.println(arr2.toString());	
		arr2.removeLast();
		arr2.removeLast();
		arr2.removeLast();
		System.out.println(arr2.toString());	
	}

}
