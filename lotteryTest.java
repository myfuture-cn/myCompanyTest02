package myLotteryTest01;

import java.util.Arrays;

public class lotteryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottery1 ={1,9,17,19,20,29};
		int[] lottery2 ={2,4,8,23,26,29};
		
		int[] test1;
		
		lottery a=new lottery(lottery1);
		lottery b=new lottery(lottery2);
		a.showLottery();
		b.showLottery();
		test1= Arrays.copyOf(a.getRowdistance(lottery1), lottery1.length-1);
		System.out.println(Arrays.toString(test1));
	}

}
