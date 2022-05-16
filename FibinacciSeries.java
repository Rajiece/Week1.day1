package week1.day1;

public class FibinacciSeries {
public static void main(String[] args) {
	int r=8;
	int firstNum=0; 
	int secNum=1;
	int sum=0;
	System.out.print(firstNum+" "+secNum);
    
	for (int i =1;i<r;i++) {
		sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
	System.out.print(" "+sum+" ");
	}
	
}
}
