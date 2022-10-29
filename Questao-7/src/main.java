import java.util.Scanner;
	import java.util.Arrays;

	public class main {
	

	    public static void main(String[] args) {
	        Scanner teclado=new Scanner(System.in);

	        long[] valor= new long[10]; 

	        System.out.println("Digite um número inteiro:");
	        valor[0]=teclado.nextLong();
	        System.out.println("Digite um um número inteiro:");
	        valor[1]=teclado.nextLong();
	        System.out.println("Digite um número inteiro:");
	        valor[2]=teclado.nextLong();
	        System.out.println("Digite o um número inteiro:");
	        valor[3]=teclado.nextLong();
	        System.out.println("Digite o um número inteiro:");
	        valor[4]=teclado.nextLong();
	        System.out.println("Digite o um número inteiro:");
	        valor[5]=teclado.nextLong();
	        System.out.println("Digite o um número inteiro:");
	        valor[6]=teclado.nextLong();
	        System.out.println("Digite o um número inteiro:");
	        valor[7]=teclado.nextLong();
	        System.out.println("Digite o um número inteiro:");
	        valor[8]=teclado.nextLong();
	        System.out.println("Digite o um número inteiro:");
	        valor[9]=teclado.nextLong();


	        boolean x;

	        do {
	         
	            x= false; 

	    
	            for(int i=0; i < valor.length - 1; i++) {

	             
	              if (valor[i] > valor[i + 1]) {

	                
	                  long aux = valor[i]; 
	                  valor[i] = valor[i + 1];
	                  valor[i + 1] = aux;

	                  x = true;
	              }
	            }
	        } while (x);

	        System.out.println("Essa é a ordem crescente dos numeros digitados: " + Arrays.toString(valor));

	    }
	}

