 package Keywords;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class c=Keywords.class;
		Method[] allMethod=c.getDeclaredMethods();
		for(Method method:allMethod){
			System.out.println(method.getName());
			if(method.getName().equals("openBrowser")){
				method.invoke(new Keywords(),"Chrome");
			}
			else if(method.getName().equals("minimize")){
				method.invoke(new Keywords());
			}
		}
		Method m1=c.getDeclaredMethod("timeStamp");
		int a=m1.getModifiers();
		System.out.println(a);
		//public key=1
		//private key = 2
		//static = 8
		//public static key =9
		//private static key =10
	}
}
