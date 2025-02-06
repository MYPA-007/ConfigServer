package test;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class x {
	
	public static void main(String[] args) {
	 
		String str="aaddjjdfmd";
		
		/*
		 * String arr[] =str.split(""); for(String x:arr) { System.out.print(x+" "); }
		 */	
		
		//(or)
		
//Ocuurunce
		   //approach 1
	   Map<String,List<String>> li=Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s));
		    System.out.println("Ocuurunce only key : "+li+"\n");           // o/p--->   {A=[A], a=[a, a], d=[d, d], e=[e, e, e], G=[G]....}
		   //approach 2
		Map<String, Long> map11=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		    System.out.println("Ocuuruncev key and value : "+map11+"\n");  //Duplicates :{a=2, d=4, f=1, j=2, m=1}
		
//Duplicates 2
	List<String> map2=	Arrays.stream(str.split(""))
		  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		    .entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey)
		      .collect(Collectors.toList());
		System.out.println("Duplicates only : "+map2);
		

	
//Unique values
	List<String> list= new ArrayList<>(Arrays.asList("abcddeffhgi")) ;
	List<String> list2= new LinkedList<>(Arrays.asList("aa bb cdef ghi")) ;
	List<String> list3= new LinkedList<>(Arrays.asList("aa bb cdef ghi")) ;
	//Objects
	Map<String, Long> x = list2.stream()
		    .flatMap(tstr1 -> Arrays.stream(tstr1.split("")))
		    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		    .entrySet().stream()
		    .filter(entry -> entry.getValue() == 1) // Filter entries where value equals 1
		    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	
	System.out.println("\nUnique Values : "+x);
	
	}
	

	/* o/p-->{a=[a, a], s=[s, s], d=[d, d], f=[f, f], j=[j], n=[n]}

	 * String x="adsfjnasdf"; 
	 * Map<Object, List<String>> m=Arrays.stream(x.split("")).collect(Collectors.groupingBy(s->s));
	 * System.out.println(m);
	 */
	
	/* String word Occurence
	 * ==============================
	 * public static void main(String[] args) { String
	 * str1="hello ra hello sai hello shiva sai"; String[] arr=str1.split(" ");
	 * Map<String,Integer> map=new HashMap<>();
	 * 
	 * for(int i=0;i<arr.length;i++) { if(map.containsKey(arr[i])) { map.put(arr[i],
	 * map.get(arr[i])+1); } else { map.put(arr[i], 1); } }
	 * for(Entry<String,Integer> e:map.entrySet()) {
	 * System.out.print(e.getKey()+" ");System.out.print(e.getValue()+" \n"); } }
	 */
	
	/*  String Character Occurence
	    ================
	
	 * public static void main(String[] args) { String str="sdsdfgsfgfgfggfgff";
	 * char[] ch=str.toCharArray(); StringBuffer sb=new StringBuffer();
	 * Map<Character,Integer> map=new HashMap<>();
	 * 
	 * for(int i=0;i<str.length();i++) { if(map.containsKey(str.charAt(i))) {
	 * map.put(ch[i],map.get(str.charAt(i))+1); } else { map.put(ch[i], 1); } }
	 * 
	 * for(Entry<Character,Integer> s :map.entrySet()) {
	 * System.out.print(s.getKey());System.out.print(s.getValue()+" "); }
	 * 
	 * 
	 * }
	 */
}


