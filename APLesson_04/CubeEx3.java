import java.util.Scanner;

public class CubeEx3
{
	static double side;
	static double sa;
	
	public static void calcSurf()
	{
		sa = 6*side*side;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with sides of length %f is %.5f",side,sa);
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter side length: ");
		side = sc.nextDouble();
		
		calcSurf();
		print();
	}
}