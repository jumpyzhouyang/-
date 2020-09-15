package 学习;

public class mao {
	  public static void main(String[] args) {
			 int [] arry = {3,9,2,1,54,65,8989,51};
			 for(int i = 0 ; i < arry.length-1 ; i++) {
				 for(int j = 0 ; j < arry.length - i-1 ; j++) {
					 if(arry[j] > arry[j+1]) {
						 int t = arry[j];
						 arry[j] = arry[j+1];
						 arry[j+1] = t;
					 }
				 }
			 }
			 for(int i = 0 ; i <arry.length ; i++) {
				 System.out.print(arry[i]+" ");
			 }
		}
}
