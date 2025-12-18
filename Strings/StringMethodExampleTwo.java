/* String Comparision */

class StringMethodExampleTwo
{
	//Entry point
	
	public static void main(String[] args)
	{
		String s1="Mihir";
		String s2="Mihir";
		
		String s3="Mihir Prasad Bhuyan";
		String s4="MIHIR PRASAD BHUYAN";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equalsIgnoreCase(s4));
		
	}
}