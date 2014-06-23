import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


public class TestClass {

	public static void stringTest(){
		
		String s2 = String.valueOf(10);
		String s1 = "10";
		System.out.println("value of s1 = " + s1);
		System.out.println("the content of s1 is " + s1.toString());
		System.out.println("the content of s2 is " + s2.toString());
		System.out.println(System.getProperty("user.dir"));
	}
	public static void collectionsProj(){
		
		List<String> listA = new ArrayList<String>();

		listA.add("element 0");
		listA.add("element 1");
		listA.add("element 2");

		//access via index
		String element0 = (String) listA.get(0);
		String element1 = (String) listA.get(1);
		String element3 = (String) listA.get(2);
		  System.out.println(element0 + "\n");
		  System.out.println(element1 + "\n");
		  System.out.println(element3 + "\n");


		//access via Iterator
		Iterator iterator = listA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println(element + "\n");
		}


		//access via new for-loop
		for(Object object : listA) {
		    String element = (String) object;
			System.out.println(element + "\n");

		}
	}
	public static int add(int number1, int number2){
		
		return (number1 + number2);
		
	}
	public static void main(String[] args) throws ParseException {
		
//		stringTest();
//		Method[] methodArray = TestClass.class.getMethods();
//		for (Method method : methodArray){
//			System.out.println(method + "\n");
//		}
//		System.out.println(TestClass.class.getName());
//	      
//		Date date1;
//	    date1 = new SimpleDateFormat("MM/dd/yy").parse("05/18/05");
//	    System.out.println(date1);
		
		collectionsProj();
	}

}
