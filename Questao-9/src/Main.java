import java.util.*;
public class Main {

	public static void main(String[] args) {
		int[][] M = new  int[4][4];
		int Maior=-1,pos1=0,pos2=0;
		Random generate = new Random();
		
		for(int i=0;i<M.length;i++) {
			for(int k=0;k<M.length;k++) {
				M[k][i]=generate.nextInt(10);
				if(M[k][i]>Maior) {
					Maior=M[k][i];
					pos1=k;
					pos2=i;
				}
			}
		}
		
		System.out.println("M"+"["+pos1+"]"+"["+pos2+"] = "+Maior+" e o maior valor do vetor M[4][4]");
		
	}

}
