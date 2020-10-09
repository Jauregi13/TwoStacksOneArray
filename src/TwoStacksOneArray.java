
public class TwoStacksOneArray {

	public static void main(String[] args) {
		
		TwoStacks stack = new TwoStacks(10);
		stack.push1(6);
		stack.push2(8);
		stack.push2(10);
		stack.push1(4);
		stack.push2(90);
		stack.push2(5);
		
		System.out.print("Elements of first stack: ");
		while(!stack.isEmpty1()) {
			System.out.print(" "+stack.pop1()+" ");
		}
		System.out.println("");
		System.out.print("Elements of second stack: ");
		while(!stack.isEmpty2()) {
			System.out.print(" "+stack.pop2()+" ");
		}

	}

}
