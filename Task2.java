import java.util.Scanner;

class Student
{
	
	int total_Marks(int eng,int mar,int math,int science,int hindi)
	{
		int total;
		total=eng+mar+math+science+hindi;
		return total;
	}
	
	float calc_Percentage(int total)
	{
		float percentage;
		percentage=total/5;
		return percentage;
	}
	
	char calc_grade(float Percentage)
	{
		if(Percentage>=35 && Percentage<55)
		{
			return 'P';
		}
		else if(Percentage>=55 && Percentage<70)
		{
			return 'C';
		}
		else if(Percentage>=70 && Percentage<80)
		{
			return 'B';
		}
		else if(Percentage>=80 && Percentage<100)
		{
			return 'A';
		}
		else
		{
			if(Percentage>=0)
			{
				return 'F';
			}
			else
			{
				return '.';
			}
		}
	}
	
	void display(int total,float percentage,char grade)
	{
		System.out.println("<<<< RESULT >>>>");
		System.out.println("Total marks:"+total);
		System.out.println("Percentage:"+percentage);
		System.out.println("Your calculated grade is:" +grade);
	}
}
class Test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student akshay=new Student();
		
		int eng,mar,math,science,hindi;
		
		System.out.println("Enter the marks of 5 subjects\nEnglish\nmarathi\nmath\nscience\nhindi\n respectively out of 100");
		eng=sc.nextInt();
		mar=sc.nextInt();
		math=sc.nextInt();
		science=sc.nextInt();
		hindi=sc.nextInt();
		
		int total=akshay.total_Marks(eng,mar,math,science,hindi);
		float percentage=akshay.calc_Percentage(total);
		char Grade=akshay.calc_grade(percentage);
		
		akshay.display(total,percentage,Grade);
	}
}