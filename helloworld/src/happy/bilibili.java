package happy;
import java.util.ArrayList;
import java.util.Calendar;

public class bilibili {

	public static void main(String[] args) {
		ArrayList<animal> my = new ArrayList<animal>();
		animal dog1 = new dog();
		dog1.beat();
	}

}
class animal{
	public animal(){
		System.out.println("animal");
	}
	public animal(int x){
		
		System.out.println("animal+"+x);
	}

}
class dog extends animal{
	public dog(){
		//super();
		System.out.println("dog");
	}
	public dog(int x){
		super(x);
		System.out.println("dog+"+x);
	}
	void beat(){
		System.out.println("n");
	}
}