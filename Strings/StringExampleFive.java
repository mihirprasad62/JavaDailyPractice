/* Java String Interning*/

class StringExampleFive
{
	//entry point of the application
	
	public static void main(String[] args)
	{
		String s1="Mihir";
		
		String s2=new String("Mihir");
		
		System.out.println(s1==s2);
		
		System.out.println(s2==s2);
		System.out.println(s2==s2.intern());
		
		String S3=s2.intern();
		
		
		
		System.out.println(s1==S3);
	}
}