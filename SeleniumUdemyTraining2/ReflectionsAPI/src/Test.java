import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		System.out.println(t.getClass().getSimpleName());

	// constructor name	
		Class clazz = new Class();
		
		Constructor [] cons = clazz.getClass().getDeclaredConstructors();
		
		System.out.println("Constructor length is " +cons.length);
		
		for (Constructor con :cons) {
			
			System.out.println(" Constructors are " + con.getName());
			
		}
		
		//Method name
		
		Method [] methods = clazz.getClass().getDeclaredMethods();
		
		for ( Method method :methods ) {
			
			System.out.println("The Return type is ->>" + method.getReturnType()+ "The method name is " + method.getName());
			

		}

}
	}
	

