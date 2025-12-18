/*Java String example two*/

class StringExampleTwo 
{
	//entry point of the application
	
	public static void main(String[] args)
	{
		String s1=new String("Mihir");
		String s2=new String("Mihir");
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
	}
}