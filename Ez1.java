import java.util.ArrayList;
import java.util.Scanner;

public class Ez1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<String> fruit = new ArrayList<>();
		for(;;) {
			String in =  kb.next();
			if(in.equals("put")) {
				String f = kb.next();
				fruit.add(f);
			}
			if(in.equals("del")) {
				int n = kb.nextInt();
				if(n<fruit.size()&&n>-1) {
					fruit.remove(n);
				}
			}
			if(in.equals("end")) {
				break;
			}
		}
		for(int i=0;i<fruit.size();i++){
			System.out.println(fruit.get(i));
		}
		if(fruit.isEmpty()){
			System.out.println("none");
		}
	}

}
