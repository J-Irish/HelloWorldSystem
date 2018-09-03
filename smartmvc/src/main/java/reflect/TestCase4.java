package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestCase4 {
	public static void main(String[] args) 
			throws ClassNotFoundException, 
			InstantiationException, 
			IllegalAccessException, 
			IllegalArgumentException, 
			InvocationTargetException {
		Scanner scanner = 
				new Scanner(System.in);
		//读取类名
		String className = 
				scanner.nextLine();
		System.out.println("className:"
				+ className);
		
		//利用java反射，加载该类，然后实例化
		Class clazz = 
				Class.forName(className);
		Object obj = clazz.newInstance();
		
		//获得该类的所有方法
		Method[] methods = 
				clazz.getDeclaredMethods();
		
		//遍历所有方法
		for(Method mh : methods) {
			//获得方法前的注解
			RequestMapping rm = 
					mh.getAnnotation(RequestMapping.class);
			System.out.println("RequestMapping注解："
					+rm);
			
			//只执行带有@RequesetMapping注解的方法
			if(rm != null) {	
				
				mh.invoke(obj);
				
				//读取@Test注解的属性值
				String value = rm.value();
				System.out.println(
						"@RequestMapping注解的属性值："+value);
				
			}
		}
		
		
		
	}
}
