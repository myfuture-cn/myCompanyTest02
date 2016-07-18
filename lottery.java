package myLotteryTest01;

import java.util.Arrays;

public class lottery {

	/*private int redball1;
	private int redball2;
	private int redball3;
	private int redball4;
	private int redball5;
	private int redball6;
	private int blueball;*/
	//private Date saledate;
	private String issue;
	private int[] lottery;
	private int[] rowDistance=new int[5];
	
	public lottery (int[] s){
		lottery=Arrays.copyOf(s,s.length);
	}//end constructor
	
	public String getIssue(){
		return issue;
	}
	public void showLottery(){
		System.out.println(Arrays.toString(lottery));
	}
	public int[] getRowdistance(int[] s){
		//int[] rowDistance=new int[6];
		for(int a=1;a<s.length;a++){
			rowDistance[a-1]=s[a]-s[a-1];
		}
		return rowDistance;
	}
	
}
