/**
*@Title   :Simple usage of BigDecimal
*@Author  :Qgf
*@Date    :12:17  5/2/2018 wed
*@Version :1.0
*/

/**
BigDecimal is generally used in calculation of the amount of money
a.Including addition,subtract,multiply and divide
b.Setting accuracy
c.Reversing
*/

import java.math.BigDecimal;

public class bigdecimal{
	public static void main(String[] agrs){
		BigDecimal abig = new BigDecimal(10.0);
		BigDecimal bbig = new BigDecimal(9.1);
		BigDecimal cbig = new BigDecimal(8.9);

		System.out.println(abig.subtract(bbig));
		System.out.println(abig.subtract(cbig));

		System.out.println(abig.subtract(bbig).setScale(2,BigDecimal.ROUND_HALF_UP));
		System.out.println(abig.subtract(cbig).setScale(2,BigDecimal.ROUND_HALF_UP));

	}
}
