//发红包算法，金额以分为单位

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;


public class RedPackage{
	public static List<Integer> divideRedPackage(Integer totalAmount, Integer totalPeopleNum){
		List<Integer> amountList = new ArrayList<Integer>();
		Integer restAmount = totalAmount;
		Integer restPeopleNum = totalPeopleNum;
		Random random = new Random();
		for (int i = 0; i < totalPeopleNum-1; i++){
			//随机范围：[1,剩余人均金额的两倍]，左闭右关
			int amount = random.nextInt(restAmount / restPeopleNum * 2);
			restAmount = restAmount - amount;
			restPeopleNum--;
			amountList.add(amount);
		}
		amountList.add(restAmount);
		return amountList;
	}
	public static void main(String[] args){
		List<Integer> amountList = divideRedPackage(5000,30);
		int j = 1;
		for (Integer amount : amountList){
			//divide(BigDecimal disivor) = this / disiivor;
			System.out.println("第" + (j++) + "位抢到金额：" + new BigDecimal(amount).divide(new BigDecimal(100)));
		}
	}
}
