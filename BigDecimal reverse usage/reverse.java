/**
*@Title   :The usage of reversing on the BigDecimal
*@Author  :Qgf
*@Date    :12:30  5/2/2018  wed
*@Version :1.0
*/

/**
Reversing
*/

import java.math.BigDecimal;

public class reverse{
	public static void main(String[] args){
		BigDecimal abig = new BigDecimal("10.0");
		BigDecimal bbig = new BigDecimal("9.1");
		BigDecimal cbig = new BigDecimal("8.9");

		System.out.println(abig.negate());
		System.out.println(bbig.negate());
		System.out.println(cbig.negate());
	}
}
