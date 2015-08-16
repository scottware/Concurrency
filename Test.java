public class Test
{ 
	public static void main(String [] args) {
		System.out.println( "hello world" );
		Counter c = new Counter();
		Thread a = new Thread(new ThreadTest(c));
		Thread b = new Thread(new ThreadTest(c));
	
		a.start();
		b.start();
	}
}
