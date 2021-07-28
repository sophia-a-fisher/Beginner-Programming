/*Sophia Fisher
  Chapter 8 - Checkerboard
  Adams - 7th period
  30 November 2018
 */


public class checker_board 
{

	public static void main(String[] args) 
	{
		printCheckerboard(3,5);
		printCheckerboard(4,4);
		printCheckerboard(8,7);

	}

	public static void printCheckerboard(int width, int height)
	{
		for(int row = 0; row < height; row++)
		{
			for(int column = 0; column < width; column++ )
			{
				if(row % 2 == 0 && column % 2 == 0 || row % 2 != 0 && column % 2 != 0)
				{
					System.out.print("#");
				}
			
				if(row % 2 != 0 && column % 2 == 0 || row % 2 == 0 && column % 2 != 0)
				{
					System.out.print(" ");
				}
			
			}
		
			System.out.println("");
		}
	System.out.println("");
	}
}
