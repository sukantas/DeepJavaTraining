package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToListExample {

public static void main(String args[]){  
//Creating Array  
String[] array={"Java","Python","PHP","Go"};  
System.out.println("Printing Array: "+Arrays.toString(array));  


//Converting Array to List  
List<String> list=new ArrayList<String>();  


for(String lang:array){  
list.add(lang);  
}  

Collections.sort(list);
System.out.println("Printing List: "+list);  
  
}  

}
