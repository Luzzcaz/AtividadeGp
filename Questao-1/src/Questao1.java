import java.util.Arrays;
public class Questao1 {
	public static void main(String[] args) {
		int[] vetRuan = new int[10];
		vetRuan[0] = 0;
		vetRuan[1] = 1;
		vetRuan[2] = 2;
		vetRuan[3] = 3;
		vetRuan[4] = 4;
		vetRuan[5] = 5;
		vetRuan[6] = 6;
		vetRuan[7] = 7;
		vetRuan[8] = 8;
		vetRuan[9] = 9;
		
		int [] vetRuanB = vetRuan.clone();
		
		for (int i = 0; i < vetRuan.length; i++) {
			System.out.println(" \n vetRuan = " +vetRuan[i]+   " \n vetRuanB = " + i*i + "");
		}
				
		

	}

}
