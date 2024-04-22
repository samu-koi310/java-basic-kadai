package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

public void DicChap(String [] dicMap) { 
	HashMap<String, String> dictionaryMap = new HashMap<String,String>();
	
		dictionaryMap.put("apple","りんご");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウィ");
		dictionaryMap.put("strawberry", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
		

	
	
	
	for (int i = 0; i < dicMap.length; i++) {
		if (null != dictionaryMap.get(dicMap[i]) ) {
			System.out.println(dicMap[i] + "の意味は" + dictionaryMap.get(dicMap[i]) );
			
		} else {
			System.out.println(dicMap[i] + "は辞書に存在しません");
		}
		
	}
	
	}

}