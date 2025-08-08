/* write program in java to use wrapper class of each primitive data types. */
public class WrapperExample
{
	public static void main (String args[])
	{
		//byte
		byte b=10;
		Byte byteObj=Byte.valueOf(b);
		System.out.println("Byte object:"+byteObj);
		
		//short
		short s=100;
		Short shortObj=Short.valueOf(s);
		System.out.println("Short object:"+shortObj);
		
		//int
		int i=500;
		Integer intObj=Integer.valueOf(i);
		System.out.println("Integer object:"+intObj);
		
		//long
		long l=10000l;
		Long longObj=Long.valueOf(l);
		System.out.println("Long object:"+longObj);
		
		//float
		float f=3.14f;
		Float floatObj=Float.valueOf(f);
		System.out.println("Float object:"+floatObj);

        //double
        double d=99.99;
        Double doubleObj=Double.valueOf(d);
        System.out.println("Character object:"+doubleObj);

        //boolean
        boolean bool=true;
        Boolean boolObj=Boolean.valueOf(bool);
        System.out.println("Boolean object:"+boolObj);

        //char
        char c='A';
        Character charObj=Character.valueOf(c);
        System.out.println("Character objectt:"+charObj);
 	}
}	