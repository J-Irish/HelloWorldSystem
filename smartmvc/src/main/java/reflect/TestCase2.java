package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestCase2 {
	public static void main(String[] args) 
			throws ClassNotFoundException, 
				InstantiationException, 
				IllegalAccessException, 
				IllegalArgumentException, 
				InvocationTargetException {
		Scanner scanner = 
				new Scanner(System.in);
		//读取类名
		String className = scanner.nextLine();
		System.out.println("className:"
		+className);
		
		//利用java反射，加载该类，然后实例化
		Class clazz = Class.forName(className);
		Object obj = clazz.newInstance();
		
		//获得该类的所有方法
		Method[] methods = 
				clazz.getDeclaredMethods();
		
		//遍历所有方法
		for(Method mh : methods) {
			//获得方法名
			String mName = mh.getName();
			//只执行以“test”开头的方法
			if(mName.startsWith("test")) {
				mh.invoke(obj);
			}
		}
	}
}
