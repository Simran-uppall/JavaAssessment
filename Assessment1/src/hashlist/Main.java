package hashlist;
import java.util.HashMap;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    HashMap<String, String> map = new HashMap<>();
        map.put("name", "simran");
	    map.put("city", "amroha");
	    map.put("pass", "test");
	    System.out.println("Hashmap before:\n" + map);
	    if(map.containsKey("name")) {
	    	if(map.containsValue("simran")) {
	    	map.replace("name", "simran", "simran uppal"); 
	        System.out.println("Hashmap  after replace():\n" + map);
	     }
	    	else {
	    		System.out.println("not matched");
	    }}
	     if(map.containsValue("test")) {
	    	 map.remove("pass","test");
	         System.out.println("hashmap after remove() :\n" + map);
	    }
	}
}