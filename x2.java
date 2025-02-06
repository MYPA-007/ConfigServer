package test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class x2 
{
	
	    public static void main(String[] args) 
	    {
	        
	   //Not Possible approach	  // Use distinct to remove duplicates 
	        String x = "ABCDEF";
	        List<String> le = Arrays.stream(x.split(""))
	                            .distinct()
	                            .collect(Collectors.toList());

	        System.out.println("After distinct: " + le);
	   
	  //Posssible Approach   // Use distinct to remove duplicates
     List<String> lix = Arrays.asList("A", "B", "A", "C", "B", "C");
        
        List<String> lex = lix.stream()
        					.map(String::toLowerCase)   	//-->work
                            .distinct() //.map(s->s.toLowerCase()) -->work
                            .collect(Collectors.toList());
        System.out.println(lex);
        
	    }   
	    
}	    
	/*
	 * public static void main(String[] args) { String x="adsfjnasdf"; Map<Object,
	 * List<String>>
	 * m=Arrays.stream(x.split("")).collect(Collectors.groupingBy(s->s));
	 * System.out.println(m);
	 * 
	 * List<String> li=new ArrayList<>(Arrays.asList("adsfjnasdf"));
	 * 
	 * //Same approach only key `1 List<String>
	 * li2=li.stream().flatMap(s->Arrays.stream(s.split("")))
	 * .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	 * .entrySet().stream() .filter(s->
	 * s.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
	 * 
	 * //Same approach key and Value `2 Map<Object, Object> li3=
	 * li.stream().flatMap(s->Arrays.stream(s.split("")))
	 * .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	 * .entrySet().stream() .filter(s->
	 * s.getValue()==1).collect(Collectors.toMap(Map.Entry::getKey,
	 * Map.Entry::getValue));
	 * 
	 * 
	 * System.out.println("li2"+li2); List<String> le = li.stream() .distinct()
	 * .collect(Collectors.toList());System.out.println(le); }
	 */	
	

