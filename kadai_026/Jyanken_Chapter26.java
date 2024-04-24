package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	String input = "";
	String jya2 = "";

	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpapperのpを入力しましょう");
		
		while(true) {
		Scanner jyan = new Scanner(System.in);
		input = jyan.next();
		System.out.println(input);
		
		if(input.equals("r") || input.equals("s") || input.equals("p")) {
			jyan.close();
			return input;
			
		}
		}
		
	}
	
	public String getRandom() {
		String[] jya = {"r", "s", "p"};
		int i = (int) Math.floor(Math.random() * 3);
	    jya2 = jya[i];
		return jya2;
		
	
		
	}
	
	public void playGame() {
		getRandom();
		HashMap<String, String> jyankenMap = new HashMap<String, String>();
			jyankenMap.put("r", "グー");
			jyankenMap.put("s", "チョキ");
			jyankenMap.put("p", "パー");
		
			System.out.println("自分の手は" + jyankenMap.get(input) + "対戦相手の手は" + jyankenMap.get(jya2));
		
		if(input.equals("r") && jya2.equals("s")) {
			System.out.println("自分の勝ちです");
			
		} else if(input.equals("r") && jya2.equals("p")) {
			System.out.println("自分の負けです");
			
		} else if(input.equals("s") && jya2.equals("r")) {
			System.out.println("自分の負けです");
			
		} else if(input.equals("s") && jya2.equals("p")) {
			System.out.println("自分の勝ちです");
			
		} else if(input.equals("p") && jya2.equals("r")) {
			System.out.println("自分の勝ちです");
			
		} else if(input.equals("p") && jya2.equals("s")) {
			System.out.println("自分の負けです");
			
		} else {
			System.out.println("あいこです");
			
		}
	}
}
