package chap07;

public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DB랑 연결할때 사용
		// Table은 행,열(Row,Col)
		
		int rowSum =0;
		int totSum = 0;
		double rowAvg =0;
		double toAvg = 0;
		int min = 999 ;
		int max = -999;
		int [][] arr = {{1,2,3},
						{4,5,6}};
		for (int i = 0; i < arr.length; i++) {// 행
			for (int j = 0; j < arr[i].length; j++) {// 열
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		
		int[][]arr2= {{90,80,96,60},{70,65,85},{100,97,67,50,90,85,60}};
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if(min > arr2[i][j]) {
					min = arr2[i][j];
				}
				if(max < arr2[i][j]) {
					max = arr2[i][j];
				}
				System.out.print(arr2[i][j]+" ");
				totSum = totSum+arr2[i][j];
			}
			
			System.out.println("");
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(totSum);
	}

}
