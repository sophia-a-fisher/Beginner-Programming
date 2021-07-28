/* Sophia Fisher
   Chapter 10 - Battery 
   Adams - 7th period
   10 January 2019
 */

//happy early birthday


public class Battery 
{
	
	int percentFull = 0;
	
	public void charge(int increase)
	{
		
		percentFull =+ increase;
		
	}
	
	public int getPercentFull()
	{
		return percentFull;
	}

}
