import java.util.*;
import java.lang.*;
public class ProgPerceptron
{
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
	public void cpack()
	{
		System.out.print("class\t");
	}
	public void cname()
	{
		System.out.println("anyname");
		System.out.println("{");
	}
	public void mfunc()
	{
		System.out.println("public static void main(String[] args)");
		System.out.println("{");
	}
	public void mfunc1()
	{
		System.out.println("public static void main(String[] args)throws Exception");
		System.out.println("{");
	}
	public void print(String param)
	{
		System.out.println("System.out.println(\""+param+"\");");
	}
	public void endmain()
	{
		System.out.println("}");
	}
	public void endclass()
	{
		System.out.println("}");
	}
	public void inits()
	{
		System.out.println("int n;");
		System.out.println("System.out.println(\"Enter the number - \");");
		System.out.println("n=sc.nextInt();");
	}
	public void initb()
	{
		System.out.println("int n;");
		System.out.println("System.out.println(\"Enter the number - \");");
		System.out.println("n=Integer.parseInt(br.readLine());");
	}
	public void loop()
	{
		System.out.println("int a=0,b=1,c=0;");
		System.out.println("for(int i=0;i<=n;i++)");
		System.out.println("{");
	}
	public void cond()
	{
		System.out.println("if(n%2==0)");
		System.out.println("System.out.println(\"Even\");");
		System.out.println("else");
		System.out.println("System.out.println(\"Odd\");");
	}
	public void fiboo()
	{
		System.out.println("System.out.println(c);");
		System.out.println("a=b;");
		System.out.println("b=c");
		System.out.println("c=a+b");
		System.out.println("}");
	}
		
	/*public static void main(String[] args)
	{
		/*Self a = new Self();
		a.Spack();
		a.cpack();
		a.cname();
		a.mfunc();
		a.print("Hello");
		a.endmain();
		a.endclass();
	*/

	static double theta1[] = new double[2];
	static double theta2[] = new double[2];
	static double theta3[] = new double[2];
	static double theta4[] = new double[2];
	static double theta5[] = new double[2];
	static double a1[] = new double[2];
	static double a2[] = new double[2];
	static double a3[] = new double[2];
	static double a4[] = new double[4];
	public  static int train(int inputs[][],int outputs[],int epoch)
	{
		//random initialisation
		Random r = new Random();
		/*theta1[] = new double[2];
		theta2[] = new double[2];
		theta3[] = new double[2];
		theta4[] = new double[1];*/
		for(int i = 0;i<2;i++)
		{
			theta1[i] = r.nextDouble();
			theta2[i] = r.nextDouble();
			theta3[i] = r.nextDouble();
			theta4[i] = r.nextDouble();
			theta5[i]=r.nextDouble();
		}
		theta4[0] = r.nextDouble();
		/*a1[] = new double[2];
		a2[] = new double[2];
		a3[] = new double[2];
		a4[] = new double[1];*/	
		a1[0] = a1[1] = 1;
		a2[0] = 1;
		a3[0] = 1;
		a4[0]=1; //a4[1]=1;
		for(int i = 0;i<epoch;i++)
		{
			
			a2[1] = sigmoid(a1[0]*theta1[0] + a1[1]*theta1[1]);
			a3[1] = sigmoid(a2[0]*theta2[0] + a2[1]*theta2[1]);
			a4[1] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);
			a4[2]=sigmoid(a4[0]*theta4[0]+a4[1]*theta4[1]);
			a4[3]=sigmoid(a4[1]*theta5[0]+a4[2]*theta5[1]);

		}
		if((a1[1] + a2[1] + a3[1] + a4[0]) > 3)
			return 1;
		else
			return 0;
	}

	public static double sigmoid(double a)
	{
		return 1/(1+Math.exp(-a));
	}

		
	public static void main(String args[])
	{
		ProgPerceptron t = new ProgPerceptron();

		int aps[][] = {{1,1,1,1,1,1},{1,1,1,0,0,0},{1,1,0,1,0,0},{1,0,1,0,0,0},{0,0,1,1,0,0}};
		int apss[] = {1,0,0,0,0};
		t.train(aps,apss,200);
		Scanner sc = new Scanner(System.in);		
		System.out.println("Fibonacci/Odd Even/Printing ?");
		String flag=sc.nextLine();
		String ch="";
		if(flag.equalsIgnoreCase("printing"))
		{
			ch="Qwerty";
		}
		else
		{
		System.out.println("Scanner or BufferedReader");	
		ch = sc.nextLine();
	    }
		String param="";
		if(flag.equalsIgnoreCase("printing"))
			{
				System.out.println("What do you want to print?");
		        param = sc.nextLine();
			}
			/*System.out.println(a1[1]);
			System.out.println(a2[1]);
			System.out.println(a3[1]);
			System.out.println(a4[0]);*/
			System.out.println("\n");
		if(a1[1] >= 0.5)
		{
			if(ch.equalsIgnoreCase("scanner"))
			{
				t.Spack();
			}
			else if(ch.equalsIgnoreCase("buffer"))
			{
				t.Bpack();
			}
		}
		if(a2[1] >= 0.5)
		{
			t.cpack();
			t.cname();
		}
		if(a3[1] >= 0.5)
		{
			if(ch.equalsIgnoreCase("scanner")||flag.equalsIgnoreCase("printing"))
			{
				t.mfunc();
			}
			else
			{
				t.mfunc1();
			}
		}
		if(a4[0] >= 0.5)
		{
			
			if(ch.equalsIgnoreCase("scanner"))
			{
				t.Sobj();
			}
			else if(ch.equalsIgnoreCase("buffer"))
			{
				t.Bobj();
			}
		
			
		}
		if(flag.equalsIgnoreCase("printing"))
		{
		        t.print(param);
			}
		else
		{
			
		if(a4[1]>=0.5)
		{
			if(ch.equalsIgnoreCase("scanner"))
			{
				t.inits();
			}
			else if(ch.equalsIgnoreCase("buffer"))
			{
				t.initb();
			}
			
		}
		if(a4[2]>=0.5)
		{
			if(flag.equalsIgnoreCase("fibonacci"))
			{
				t.loop();
			}
		}
		if(a4[3]>=0.5)
		{
			if(flag.equalsIgnoreCase("odd"))
			{
				t.cond();
			}
			else if(flag.equalsIgnoreCase("fibonacci"))
			{
				t.fiboo();
			}
			
				
		}
		}
			
			t.endmain();
			t.endclass();
	}
}
