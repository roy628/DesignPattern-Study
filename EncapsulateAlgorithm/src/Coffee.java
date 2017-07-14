import java.io.*;

public class Coffee extends CaffeineBeverage {

	
	public void brew(){
		System.out.println("Deipping Coffee through filter");
	}
	
	public void addCondiments(){
		System.out.println("Adding Sugar and Milk");
	}
	
	public boolean customerWantsCondiments(){
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}else{
			return false;
		}
	}
	
	private String getUserInput() {
		String answer = null;
		
		System.out.println("Would you like milk and sugar with you coffee(y/n)?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			answer = in.readLine();
		} catch(IOException e) {
			System.err.println("IO error trying to read your answer");
		}
		if(answer == null)
			return "no";
		return answer;
	}
}
