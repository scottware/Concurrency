public class ThreadTest implements Runnable {

	Counter counter;

	public ThreadTest(Counter c) {
		this.counter = c;
	}

	public void run() {
while(counter.getCount() < 1000 ) {
		counter.increment();
		System.out.println( Integer.toString(counter.getCount()) );
        	//System.out.println("Hello from a thread!");
}
    }

}
