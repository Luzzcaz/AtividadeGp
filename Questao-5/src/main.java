
	import java.util.Scanner;
	
public class main {
	
	public static void main(String[] args){
	
		  Scanner leitor=new Scanner(System.in);

	        long[] nota1= new long[10]; 
	        long[] nota2= new long[10];
	        long[] Result= new long[10];

	        System.out.println("Digite a primeira nota do aluno 1:");
	        nota1[0]=leitor.nextLong();
	        System.out.println("Digite a primeira nota do aluno 2:");
	        nota1[1]=leitor.nextLong();
	        System.out.println("Digite a primeira nota do aluno 3:");
	        nota1[2]=leitor.nextLong();
	        System.out.println("Digite a primeira nota do aluno 4:");
	        nota1[3]=leitor.nextLong();
	        System.out.println("Digite a primeira nota do aluno 5:");
	        nota1[4]=leitor.nextLong();
	        System.out.println("Digite a primeira nota do aluno 6:");
	        nota1[5]=leitor.nextLong();
	        System.out.println("Digite a primeira nota do aluno 7:");
	        nota1[6]=leitor.nextLong();
	        System.out.println("Digite a primeira nota do aluno 8:");
	        nota1[7]=leitor.nextLong();
	        System.out.println("Digite a primeira nota do aluno 9:");
	        nota1[8]=leitor.nextLong();
	        System.out.println("Digite a primeira nota do aluno 10:");
	        nota1[9]=leitor.nextLong();
	        
	        System.out.println("Digite a segunda nota do aluno 1:");
	        nota2[0]=leitor.nextLong();
	        System.out.println("Digite a segunda nota do aluno 2:");
	        nota2[1]=leitor.nextLong();
	        System.out.println("Digite a segunda nota do aluno 3:");
	        nota2[2]=leitor.nextLong();
	        System.out.println("Digite a segunda nota do aluno 4:");
	        nota2[3]=leitor.nextLong();
	        System.out.println("Digite a segunda nota do aluno 5:");
	        nota2[4]=leitor.nextLong();
	        System.out.println("Digite a segunda nota do aluno 6:");
	        nota2[5]=leitor.nextLong();
	        System.out.println("Digite a segunda nota do aluno 7:");
	        nota2[6]=leitor.nextLong();
	        System.out.println("Digite a segunda nota do aluno 8:");
	        nota2[7]=leitor.nextLong();
	        System.out.println("Digite a segunda nota do aluno 9:");
	        nota2[8]=leitor.nextLong();
	        System.out.println("Digite a segunda nota do aluno 10:");
	        nota2[9]=leitor.nextLong();
	        
	        for(int i=0;i<Result.length;i++) {
	        	 Result[i]=((nota1[i]+nota2[i])/2);
	        	 
	        }
	        
	}
}