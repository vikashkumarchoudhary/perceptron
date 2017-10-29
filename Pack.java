
import java.util.*;

public class Pack
{
	private int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
			}

		return (int)(Math.random() * ((max - min) + 1)) + min;
	}

	 public void Spack()
        {
                System.out.println("import.java.util.*;");
        }
        public void Bpack()
        {
                System.out.println("import java.io.*;");
        }
        public void Sobj()
        {
                System.out.println("Scanner sc = new Scanner(System.in);");
        }
        public void Bobj()
        {
                System.out.println("BufferedReader br = new BufferedReader(new InputStreamReader);");
        }

	String quest[]={"Fibonacci","Odd","Even"};
	public int input(String ss)
	{	
		//Random r=new Random();
		for(int i=0;i<quest.length;i++)
		{
			if((ss.equalsIgnoreCase("Printing"))||(ss.equalsIgnoreCase(quest[i])))
			{
				 int num=getRandomNumberInRange(1,2);
				if(num==1)
					return 5;
				else
					return 10;
			}
		
	}
				return -1;
}
	public int input1(String s)
	{
		if(s.equalsIgnoreCase("Printing"))
		return 1;
		else
		return 0;
	}	

}

