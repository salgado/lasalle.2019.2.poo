import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vet = new int[4];
		int x;
		Scanner sc = new Scanner(System.in);
		
		try{
		
			System.out.println("Entre com um numero:");
			int num = sc.nextInt();
			
			System.out.println("Num lido = " + num);
			
			x = 1 / 0;
			
			vet[0] = 10;
			//vet[4] = 9;
			
			System.out.println("Fim de programa!!");
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("Erro ao acessar o vetor.");
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Nao pode dividir por ZERO.");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Tipo digitado incorreto!");
		}
		catch(Exception e)
		{
			System.out.println("Erro no sistema.");
		}
		finally {
			System.out.println("Boa noite!!");
		}
		
		
	}

}
