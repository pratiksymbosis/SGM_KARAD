package demo;

import com.test.protectedVal.SampleProtectedInheritance;

public class HelloWord extends SampleProtectedInheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object cratiion of the class
		 HelloWord obj=new HelloWord();
		 System.out.println("protcted value test"+obj.data);
		 
		 //call to the method
		 String k=null;
		//k="Pratik";
		 String s=obj.returnStringData( k);
		 k="pratik";
		 String w=obj.returnStringData( k);
		 String z="";
		 String a=obj.returnStringData( z);
		 
		 
		 
		System.out.println("Nulll data "+s);
		System.out.println("Data "+w);
		System.out.println("Empty data "+a);
		

	}

	
	public String returnStringData(String data){
		
		if(null!=data && data.length()>0){
			return "Hello "+data;
		}else{
			return "Hello World";
		}
		
		
		
		
		
	}
}
