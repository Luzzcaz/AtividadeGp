import java.util.*;
public class Main {

	public static void main(String[] args) {
		int[][] M = new  int[3][3];
		int par=0,impar=0; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite alguns valores: ");
		
		for(int i=0;i<M.length;i++) {
			for(int k=0;k<M.length;k++) {
				M[k][i]=scan.nextInt();
				if(M[k][i]%2==0) {
					par++;
				}else {
					impar++;
				}
			}
		}
		
		for(int i=0;i<M.length;i++) {
			for(int k=0;k<M.length;k++) {
				System.out.println("pos"+(k+1)+" pos"+(i+1)+" = "+M[k][i]);
			}
		}
		
		System.out.println("Pares = "+par+" Impares = "+impar);
	}

}
