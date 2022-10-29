import java.util.Arrays;
public class Questao2 {

	public static void main(String[] args) {
		int[]vA = {0,1,2,3,4,5,6,7,8,9};
		int[]vB = {5,5,5,5,5,5,5,5,5,5};
		int[]vC = {vA[0]+vB[0],vA[1]+vB[1],vA[2]+vB[2],vA[3]+vB[3],vA[4]+vB[4],vA[5]+vB[5],vA[6]+vB[6],vA[7]+vB[7],vA[8]+vB[8],vA[9]+vB[9]};
		
		for(int i = 0; i < vC.length; i++) {
			System.out.println("\n vA = " +vA[i]+ "\n vB = " +vB[i]+ " \n vC = " + vC[i]);	
		}
		

	}

}
