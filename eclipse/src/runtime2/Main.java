package runtime2;

public class Main {
	public static void main(String[] args) {
		//Actor result = Dispatcher.evaluate(new SquareActor(), new Actor[] {int1, int2});
		Actor result = Dispatcher.evaluate(new Program1(), new Actor[0]);
		
		System.out.println(result);
	}
}
