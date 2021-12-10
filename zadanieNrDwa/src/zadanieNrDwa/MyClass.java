package zadanieNrDwa;

public class MyClass {
	public static void main (String[] args) 
	  {
		Stack stack = new Stack(5);
		
		stack.Push(4.3);
		stack.Push(5);
		stack.Push(-2.4);
		stack.Push(0);
		stack.Push(-7.3);
		
		System.out.println("Zawartoœæ stosu:");
		stack.print();
		
		System.out.println("Najmniejsza wartosc w stosie to: "+stack.PeekMin());
		
		stack.Pop();
		stack.Pop();
		System.out.println("Zawartoœæ stosu po usuniêciu dwóch elementów:");
		stack.print();
	  }
}
