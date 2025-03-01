package askedPgms;

import java.util.HashMap;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		String str="shine amarakuni pulpally";
		
		char [] charArray=str.toCharArray();
		
		HashMap<Character,Integer> hmap=new HashMap<>();
		
		for(char c:charArray) {
			
//			if(hmap.get(c)!=null) {
//				hmap.put(c, hmap.get(c)+1);
//			}
//			else
//				hmap.put(c, 1);
			
			//Using teritiary operator
			
			hmap.put(c,hmap.containsKey(c)?hmap.get(c)+1:1);
			
		}
		
		//Using Loops
		for(char c:hmap.keySet()) {
			
			if(hmap.get(c)>1&& c!=' ')
			System.out.println(c+":"+hmap.get(c));
		}
				
		//Using Streams	
		hmap.entrySet().stream().filter(c->c.getValue()>1 && c.getKey()!=' ').forEach(s->System.out.println(s.getKey()+":"+s.getValue()));

	}

}
