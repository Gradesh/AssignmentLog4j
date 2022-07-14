import java.util.*;


public class optimalClass {

	public static void main(String[] args) 
	{
		optimalClass oc =new optimalClass();
		String [] line= new String [25];
		Optional<String>posWord=Optional.ofNullable(line[8]);
		if (!posWord.isPresent())
		{
			System.out.println("Line is Empty...!");
		}
		else
		{
			String word= line[8].toLowerCase();
			System.out.println(word);
		}
		Integer val1= null;
		Integer val2= new Integer(10);
		Optional<Integer> a=Optional.ofNullable(val1);
		Optional<Integer> b= Optional.of(val2);	
		
		System.out.println(oc.SumofInteger(a, b));
		

	}
	
	
	public Integer SumofInteger(Optional<Integer>a,Optional<Integer>b)
	{
		System.out.println("First Parameter is:"+a.isPresent());
		System.out.println("Second Parameter is:"+b.isPresent());
			Integer param1=a.orElse(new Integer(15));
			Integer param2 =b.get();
			
			return param1+param2;
		
	}

}
