import java.util.*;
import java.lang.*;
public class ProgPerceptron
{
	public static int keywordstack(String key)
	{
		String array[] = {
                 "abstract",  "assert",       "boolean",    "break",      "byte",      "case",
                 "catch",     "char",         "class",      "const",     "continue",
                 "default",   "do",           "double",     "else",      "extends",
                 "false",     "final",        "finally",    "float",     "for",
                 "goto",      "if",           "implements", "import",    "instanceof",
                 "int",       "interface",    "long",       "native",    "new",
                 "null",      "package",      "private",    "protected", "public",
                 "return",    "short",        "static",     "strictfp",  "super",
                 "switch",    "synchronized", "this",       "throw",     "throws",
                 "transient", "true",         "try",        "void",      "volatile",
                 "while"
                  };
             int flag=0;
             for(int i=0;i<array.length;i++)
             {
				 if(key.equals(array[i])==true)
				 flag++;
	     }
			 if(flag>0)
			 return 1;
			 else
			 return 0;
	}

	public void cpack()
	{
		System.out.print("class ");
	}
	//------------------TO PRINT STRAY STRING--------------------------
	public void cname(String classname)
	{
		System.out.println(classname);
	}
	//---------------------MAIN FUNCTION-----------------------------
	public void mfunc()
	{
		System.out.println("public static void main(String[] args)");
	}
	//--------------------MAIN WITH EXCEPTION HANDLING
	public void mfunc1()
	{
		System.out.println("public static void main(String[] args)throws IOException");
	}
	//--------------------PRINT WITH QUOTES----------------
	public void printwithquote(String param)
	{
		System.out.println("System.out.println(\""+param+"\");");
	}
	//------------------PRINT WITHOUT QUOTES------------------
	public void printwithoutquote(String param)
	{
		System.out.println("System.out.println("+param+");");
	}
	//------------------CLOSE BRACES-----------------
	public void closebrace()
	{
		System.out.println("}");
	}
	//------------------OPEN BRACES-------------------
	public void openbrace()
	{
		System.out.println("{");
	}
	//------------------SCANNER INPUT FOR INT--------------
	public void scannerinputInt()
	{
		System.out.println("sc.nextInt();");
	}
	//------------------BUFFERED READER INPUT FOR INT-----------
	public void bufferinputInt()
	{
		System.out.println("Integer.parseInt(br.readLine());");
	}
	//------------------SCANNER INPUT FOR STRING----------------
	public void scannerinputString()
	{
		System.out.println("sc.nextLine();");
	}
	//-------------------BUFFERED READER INPUT FOR STRING-------------
	public void bufferinputString()
	{
		System.out.println("br.readLine();");
	}
	//----------------INITIALIZATION OF N--------------------------
	public void init()
	{
		System.out.println("int n;");
	}
	//------------------------INPUTTING------------------
	public void inp()
	{
		System.out.println("System.out.println(\"Enter the number - \");");
		System.out.print("n=");
	}
	//-----------------INITIALIZATION FOR FIBONACCI-----------------
	public void fibovarinit()
	{
		System.out.println("int a=0,b=1,c=0;");
	}
	//-------------------LOOP STATEMENT 0 TO N-----------------
	public void loop()
	{
		System.out.println("for(int i=0;i<=n;i++)");
	}
	public void cond()
	{
		System.out.println("if(n%2==0)");
	}
	//------------------PRINT ONLY ELSE---------------------
	public void elseprint()
	{
		System.out.println("else");
	}
	public void fiboo()
	{
		System.out.println("a=b;");
		System.out.println("b=c;");
	}
	public void add()
	{
		System.out.println("c=a+b;");
	}
	static double theta1[] = new double[2];
	static double theta2[] = new double[2];
	static double theta3[] = new double[2];
	static double theta4[] = new double[2];
	static double a1[] = new double[2];
	static double a2[] = new double[2];
	static double a3[] = new double[2];
	static double a4[] = new double[4];
	public  static int train(int inputs[][],int outputs[],int epoch)
	{
		//random initialisation
		Random r = new Random();
		for(int i = 0;i < 2;i++)
		{
			theta1[i] = r.nextDouble();
			theta2[i] = r.nextDouble();
			theta3[i] = r.nextDouble();
			theta4[i] = r.nextDouble();
		}
		a1[0] = a1[1] = 1;
		a2[0] = 1;
		a3[0] = 1;
		for(int i1 = 0;i1 < inputs.length;i1++)
		{
			int j1 = 0;
			a2[1] = inputs[i1][j1];
			a3[1] = inputs[i1][j1+1];
			a4[0] = inputs[i1][j1+2];
			a4[1] = inputs[i1][j1+3];
			a4[2] = inputs[i1][j1+4];
			a4[3] = inputs[i1][j1+5];
			for(int i = 0;i<epoch;i++)
			{
				theta3[0] = r.nextDouble();
				theta3[1] = r.nextDouble();
				a2[1] = sigmoid(a1[0]*theta1[0] + a1[1]*theta1[1]);
				a3[1] = sigmoid(a2[0]*theta2[0] + a2[1]*theta2[1]);
				a4[0] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);
				theta3[0] = r.nextDouble();
				theta3[1] = r.nextDouble();
				a4[1] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);
				theta3[0] = r.nextDouble();
				theta3[1] = r.nextDouble();
				a4[2] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);
				theta3[0] = r.nextDouble();
				theta3[1] = r.nextDouble();
				a4[3] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);
			}
		}
		if(sigmoid(a1[1] + a2[1] + a3[1] + a4[0] + a4[1] + a4[2] + a4[3]) > 0.5)
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
		Pack obj=new Pack();
		ProgPerceptron t = new ProgPerceptron();
		int aps[][] = {{1,1,1,1,1,1},{1,1,0,0,0,1},{1,1,0,1,0,0},{1,0,1,0,0,0},{0,0,1,1,0,0}};
		int apss[] = {1,1,0,0,0};
		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci/Odd Even/Printing ?");
		System.out.println("What do you want to do?");
		String var = sc.nextLine();
		String flag[] =var.split(" ");
		String ch="",classname="",param="";
		int cout=0;
		System.out.println("What do you want to name your class ?");
		classname=sc.nextLine();
		for(int i=1;i<classname.length();i++)
		{
			int call=keywordstack(classname);
			if(((int)classname.charAt(0))<65 || ((int)classname.charAt(0))>122 || (((int)classname.charAt(0)>90) && ((int)classname.charAt(0)<97)))
			{
				i=0;
				System.out.println("A Class name cannot start with a Special Character or digit !");
				System.out.println("What do you want to name your class ?");
		        	classname=sc.nextLine();
			}
			else if(Character.isDigit(classname.charAt(i))==false && ((int)classname.charAt(i))!=95 && Character.isLetter(classname.charAt(i))==false)
			{
				i=0;
				System.out.println("A class name cannot contain special characters except '_'");
				System.out.println("What do you want to name your class ?");
		        	classname=sc.nextLine();
		     	}
			else if(call==1)
		    	{
				i=0;
				System.out.println("A class name cannot be a reserved keyword");
				System.out.println("What do you want to name your class ?");
		        	classname=sc.nextLine();  
			}
		}
		for(int z = 0;z<flag.length;z++)
	        {
	                int num=obj.input(flag[z]);
	                int num1=obj.input1(flag[z]);
			t.train(aps,apss,200);
			if(num1==1)
			{
				System.out.println("What do you want to print?");
		        	param = sc.nextLine();
				a1[1] = a4[0] = a4[1] = a4[2] = a4[3] = 0; 
			}
			System.out.println("\n");
			if(flag[z].equalsIgnoreCase("printing") != true && z==0)
			{
				if(num==5)
				{
					obj.Spack();
				}
				if(num==10)
				{
					obj.Bpack();
				}
			}
			if(a2[1] >= 0.5 && z==0)
			{
				t.cpack();
				t.cname(classname);
				t.openbrace();
			}
			if(a3[1] >= 0.5 && z==0)
			{
				if(z==0 && (ch.equalsIgnoreCase("scanner")||flag[z].equalsIgnoreCase("printing")))
				{
					t.mfunc();
					t.openbrace();
				}
				else
				{
					t.mfunc1();
					t.openbrace();
				}
			}
			if(a4[0] >= 0.5 && z==0)
			{
				if(num==5)
				{
					obj.Sobj();
				}
				else if(num==10)
				{
					obj.Bobj();
				}
			}
			if(flag[z].equalsIgnoreCase("printing"))
			{
			        t.printwithquote(param);
			}
			else
			{
				if(a4[1]>=0.5)
				{
					if(ch.equalsIgnoreCase("scanner"))
					{
						t.init();
						t.inp();
						t.scannerinputInt();
					}
					else if(ch.equalsIgnoreCase("buffer"))
					{
						t.init();
						t.inp();
						t.bufferinputInt();
					}
				}
				if(a4[2]>=0.5)
				{
					if(flag[z].equalsIgnoreCase("fibonacci"))
					{
						t.fibovarinit();
						t.loop();
						t.openbrace();
						t.printwithoutquote("c");
						t.fiboo();
						t.add();
						t.closebrace();
						a4[3] = 0;
					}
				}
				if(a4[3]>=0.5)
				{
					if(flag[z].equalsIgnoreCase("odd"))
					{
						t.cond();
						t.printwithquote("Even");
						t.elseprint();
						t.printwithquote("Odd");
						a4[2] = 0;
					}
				}
			}
		/*System.out.println(a1[1]);
		System.out.println(a2[1]);
		System.out.println(a3[1]);
		System.out.println(a4[0]);
		System.out.println(a4[1]);
		System.out.println(a4[2]);
		System.out.println(a4[3]);*/
		}
	t.closebrace();
	t.closebrace();	
	}
}
