package hashlist;
import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
public class SelectKey {
	public static void main(String args[]){  
		   HashMap<String,String> map=new HashMap<>();
		   map.put("name  ","Simran");   
		   map.put("city  ","Amroha");    
		   map.put("test ","Pass");   
		   map.put("religion ","Hindu");   
		   System.out.println("Hashmap = " + map);  
		   System.out.println("Keys  : ");
		      Set keys = map.keySet();
		      Iterator i = keys.iterator();
		      while (i.hasNext()) {
		         System.out.println(i.next());
		      }
		      System.out.println("Values  : ");
		      Collection getValues = map.values();
		      i = getValues.iterator();
		      while (i.hasNext()) {
		         System.out.println(i.next());
		      }
		   
		}  

}
