package in.co.rays.practice;

public class TestWhile1 {
public static void main(String args[])
{
	int i=100;
	do {
		if(i%2!=0)
		{
		System.out.println(i);
		}
		i--;
	}while(i>0);
	
	
	/*while(i>0)
	{
		if(i%2==0)
		{
		System.out.println(i);
		}
//		else {
//			System.out.println("no");
//		}
		i--;
	}
	*/
}
}
