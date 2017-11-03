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
	//------------------REMAINDER------------------
	public void remainder()
	{
		System.out.println("r = n%10;");
	}
	//-----------------Palindrome 1-------------------
	public void pal()
	{
		System.out.println("sum = (sum*10) + r;");
	}
	//------------------N = N/10----------------------
	public void n10()
	{
		System.out.println("n = n/10;");
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
	//-----------------INITIALIZATION FOR pALINDROME---------------
	public void pinit()
	{
	        System.out.println("int r,sum=0,temp;");
	}
	//-------------------LOOP STATEMENT 0 TO N-----------------
	public void loop()
	{
		System.out.println("for(int i=0;i<n;i++)");
	}
	public void remi()
	{
		System.out.println("if(n%i == 0)");
	}
	public void primeinit()
	{
		System.out.println("int cnt = 0;");
	}
	public void increment()
	{
		System.out.println("cnt++;");
	}
	public void primecheck()
	{
		System.out.println("if(cnt == 1)");
	}
	//-------------------WHILE N > 0------------------------
	public void wloop()
	{
		System.out.println("while(n>0)");
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
	//-----------------PRINT YES----------------------
	public void yes()
	{
		System.out.println("System.out.println(\"Yes\");");
	}
	//-----------------PRINT NO------------------------
	public void no()
	{
		System.out.println("System.out.println(\"No\");");
	}
	public void pcond()
	{
		System.out.println("if(temp == sum)");
  	}
	public void add()
	{
		System.out.println("c=a+b;");
	}
	public void tem()
	{
		System.out.println("temp = n;");
	}
	static double theta1[] = new double[2];
	static double theta2[] = new double[2];
	static double theta3[] = new double[2];
	static double a1[] = new double[2];
	static double a2[] = new double[2];
	static double a3[] = new double[2];
	static double a4[] = new double[6];
	public  static int train(int inputs[][],int outputs[],int epoch)
	{
		//random initialisation
		Random r = new Random();
		for(int i = 0;i < 2;i++)
		{
			theta1[i] = r.nextDouble();
			theta2[i] = r.nextDouble();
			theta3[i] = r.nextDouble();
		}
		a1[0] = a1[1] = 1;
		a2[0] = 1;
		a3[0] = 1;
		for(int i1 = 0;i1 < inputs.length;i1++)
		{
			int j1 = 0;
			a2[1] = inputs[i1][j1++];
			a3[1] = inputs[i1][j1++];
			a4[0] = inputs[i1][j1++];
			a4[1] = inputs[i1][j1++];
			a4[2] = inputs[i1][j1++];
			a4[3] = inputs[i1][j1++];
			a4[4] = inputs[i1][j1++];
			a4[5] = inputs[i1][j1];
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
				theta3[0] = r.nextDouble();
				theta3[1] = r.nextDouble();
				a4[4] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);
				theta3[0] = r.nextDouble();
				theta3[1] = r.nextDouble();
				a4[5] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);
			}
		}
		if(sigmoid(a1[1] + a2[1] + a3[1] + a4[0] + a4[1] + a4[2] + a4[3] + a4[4] + a4[5]) > 0.5)
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
		int aps[][] = {{1,1,1,1,1,1,1,1},{1,1,0,0,0,1,0,1},{1,1,0,1,0,0,0,0},{1,0,1,0,0,0,0,0},{0,0,1,1,0,0,0,1}};
		int apss[] = {1,1,0,0,0};
		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci/Odd Even/Printing/palindrome/prime ?");
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
		int pack_cnt,class_cnt,main_cnt,obj_cnt;
		pack_cnt = class_cnt = main_cnt = obj_cnt = 0;
		for(int z = 0;z<flag.length;z++)
	        {
	                int num=obj.input(flag[z]);
	                int num1=obj.input1(flag[z]);
			t.train(aps,apss,200);
			if(num1==1)
			{
				System.out.println("What do you want to print?");
		        	param = sc.nextLine();
				a1[1] = a4[0] = a4[1] = a4[2] = a4[3] = a4[4] = a4[5] = 0; 
			}
			System.out.println("\n");
			if(flag[z].equalsIgnoreCase("printing") != true && pack_cnt == 0)
			{
				if(num==5)
				{
					obj.Spack();
					ch = "scanner";
				}
				if(num==10)
				{
					obj.Bpack();
					ch = "buffer";
				}
				pack_cnt += 1;
			}
			if(a2[1] >= 0.5 && class_cnt == 0)
			{
				t.cpack();
				t.cname(classname);
				t.openbrace();
				class_cnt += 1;
			}
			if(a3[1] >= 0.5 && main_cnt == 0)
			{
				if(ch == "scanner" ||(flag[z].equalsIgnoreCase("printing")))
				{
					t.mfunc();
					t.openbrace();
				}
				else
				{
					t.mfunc1();
					t.openbrace();
				}
				main_cnt += 1;
			}
			if(a4[0] >= 0.5 && obj_cnt == 0)
			{
				if(num==5)
				{
					obj.Sobj();
				}
				else if(num==10)
				{
					obj.Bobj();
				}
				obj_cnt += 1;
			}
			if(flag[z].equalsIgnoreCase("printing") != true && obj_cnt == 1)
			{
				if(a4[1]>=0.5)
				{
					t.init();
					if(num == 5)
					{
						t.inp();
						t.scannerinputInt();
					}
					if(num == 10)
					{
						t.inp();
						t.bufferinputInt();
					}
					obj_cnt += 1;
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
					a4[3] = a4[4] = a4[5] = 0;
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
					a4[2] = a4[4] = a4[5] = 0;
				}
			}
			if(a4[4] >= 0.5)
			{
				if(flag[z].equalsIgnoreCase("palindrome"))
				{
					t.pinit();
					t.tem();
					t.wloop();
					t.openbrace();
					t.remainder();
					t.pal();
					t.n10();
		                        t.closebrace();
					t.pcond();
					t.yes();
					t.elseprint();
					t.no();
					a4[2] = a4[3] = a4[5] = 0;
				}
			}			
			if(a4[5] >= 0.5)
			{
				if(flag[z].equalsIgnoreCase("prime"))
				{
					t.primeinit();
					t.loop();
					t.openbrace();
					t.remi();
					t.increment();
					t.closebrace();
					t.primecheck();
					t.yes();
					t.elseprint();
					t.no();
				}
				a4[2] = a4[3] = a4[4] = 0;
			}
			else
			{
				t.printwithquote(param);
			}
		/*System.out.println(a1[1]);
		System.out.println(a2[1]);
		System.out.println(a3[1]);
		System.out.println(a4[0]);
		System.out.println(a4[1]);
		System.out.println(a4[2]);
		System.out.println(a4[3]);
		System.out.println(a4[4]);
		System.out.println(a4[5]);*/
		}
	t.closebrace();
	t.closebrace();	
	}
}
