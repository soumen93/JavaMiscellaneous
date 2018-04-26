package JavaInterfaceAndAbstractClass;
/**
 * @author I332330
 *Java 'interface' is ensure full data abstraction. few main feature of java interface is-->
 *
 *i)you can only mention the method signature in a interface not method body i.e. method are in interface are 
 *  by default abstract.
 *
 *ii)Any field decalred inside an interface is by default 'public static final'
 *
 * iii)Any class that is implementing the interface must be override or implement all the method signautre
 *     declared in the interface.
 * 
 * iv)one class can implements more than one interface thus we achive the multiple inheritence in java.
 *    Even a interface can extends one or more interface.      
 */

/**
 *In Java8, it introduces few extra features like-->
 *  i)interface can have default method implementation which allows us flexibility that even extending
 *        class may or may not implement that method.
 *  ii)in interface you can declare a static block. which can be called without any instance.   
 */

interface vechile{
	//each field you mention must be a public static final
	public static final int i=0;
	
	//each method  abstract by default
	public void accelarate();
	public void changeGear();
}


public class JavaInterface {
     public static void main(String[] args) {
    	 
     }
}
