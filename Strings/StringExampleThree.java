/* Java String Example Three*/

class StringExampleThree
{
	//Entry point of the application
	public static void main(String[] args)
	{
		String s1="Mihir";
		
		String s2="Mihir";
		
		String s3=new String("Mihir");
		
		String s4=new String("Mihir");
		
		
		System.out.println(s1==s2); //true
		System.out.println(s3==s4); //false
		System.out.println(s1==s3); //false
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s3.equals(s4)); //true
		System.out.println(s1.equals(s3)); //true
	}
}