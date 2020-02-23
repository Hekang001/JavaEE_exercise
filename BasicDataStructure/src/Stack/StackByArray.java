package Stack;

import Array.MyArray;

/**
 * 使用动态数组实现栈
 * @author yzz
 *
 */
public class StackByArray<E> implements iStack<E> {
	MyArray<E> array;
	
	public StackByArray(int capacity){
		array = new MyArray<>(capacity);
	}
	
	public StackByArray() {
		array = new MyArray<>();
	}
	
	@Override
	public int getSize() {
		return array.getSize();
	}
	
	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}
	
	@Override
	public void push(E e) {
		array.addLast(e);
	}
	
	@Override
	public E pop() {
		return array.removeLast();
	}
	
	@Override
	public E peak() {
		return array.getLast();
	}

	@Override
	public String toString() {
		StringBuffer res = new StringBuffer();
		res.append("stack: [");
		for (int i = 0; i < array.getSize(); i++) {
			res.append(array.get(i));
			if ( i != array.getSize() - 1) {
				res.append(",");
			}
		}
		res.append("]top");
		return res.toString();
	}
	
	
}
