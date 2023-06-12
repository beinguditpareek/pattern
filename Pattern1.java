package pattern;

public class Pattern1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) 
		{
			for (int j = 5; j >= 1; j--)
			{
				if (j <= i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for (int k = 1; k < i; k++) 
			{
				System.out.print("* ");
			}
			System.out.println("  ");
		}
	
	}
}
