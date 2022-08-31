package assesslist;

import java.util.ArrayList;

public class NameList {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sumit");
        list.add("Riya");
        list.add("Rahul");
        list.add("Simran");
        System.out.println("before list = " + list);
        if(list.contains("Simran")) {  
            list.set(list.indexOf("Simran"),"simran Uppal");
            System.out.println("after replacing = " + list);
            }
        else  
            System.out.println("Result not matched");      
            }
       }


