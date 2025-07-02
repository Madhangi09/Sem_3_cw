import java.util.*;
public class TwoDimensionalArray{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns:");
		int cols=sc.nextInt();
		int[][] twod=new int[rows][cols]; //2D array creation
		System.out.println("*****Enter the values:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				twod[i][j]=sc.nextInt(); //insert in the array
			}
		}
		System.out.println("*****Values in the array*****");
for(int i=0;i<rows;i++)
	{
			for(int j=0;j<cols;j++)
			{
				System.out.print(twod[i][j]+"\t");
			}
			System.out.println();
		}
}
}
import java.util.*;
publc class StudentRecord{
    static int maxRowSize=100;
    static String[][] student_list=new String[maxRoSize][3];
    static int size=0;
    public static void
    public static void main(String[] args){
        scanner sc=new Scanner(system.in);
    }
}