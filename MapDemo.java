package codegananDSA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] agrs) { 
		HashMap<Integer,String> hs=new HashMap();
		hs.put(123,"deva");
		hs.put(536,"sena");
		hs.put(232,"aa");
		hs.put(836, "bahu");
		hs.put(345,"kalyan");
		System.out.println(hs);
		System.out.println(hs.containsKey(232));
		System.out.println(hs.get(345));
		System.out.println(hs.getOrDefault(1345, "pavan"));
		System.out.println(hs.isEmpty());
		
		Set<Entry<Integer,String>> st=hs.entrySet();
		Iterator<Entry<Integer,String>>itr=st.iterator();
		while(itr.hasNext()) {
			Entry<Integer,String>finalResult=itr.next();
			System.out.println(finalResult.getKey()+" "+finalResult.getValue());
		}
		
		
	}

}
