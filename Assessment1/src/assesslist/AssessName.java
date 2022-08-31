package assesslist;
import java.util.ArrayList;

public class AssessName {
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("JAVA");
	        list.add("PYTHON");
	        list.add("RUBY");
	        list.add("DATA SCIENCE");
	        System.out.println(list);
	        int size = list.size();
	        list.add(size,"Selenium");
	        System.out.println(list);
	    }
	}


