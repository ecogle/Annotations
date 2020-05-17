package com.eco.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Testing {
	
	public static void main(String[] args)
	{
		try {
			Testing test = new Testing();		
			Method[] methods = Testing.class.getMethods();
			
			for(Method method : methods) {
				for(Annotation annot : method.getAnnotations()) {
					if(annot instanceof Types) {
						System.out.print(method.getName() + " :  ");						
						System.out.println(method.getAnnotation(Types.class).name() + " " + method.getAnnotation(Types.class).type());
						method.invoke(test);
					}
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
	
	@Types(name="chad", type=MethodTypes.STATIC)
	public void MyMethod() {
		System.out.println("This is my method");
	}
	
	

}
