import java.util.Scanner; 
 
public class atividade5 { 
public static void main(String[] args) { 
Scanner entrada = new Scanner(System.in);



System.out.println("codigo do produto"); 
int codigo = entrada.nextInt();

System.out.println("quantia"); 
int quantia = entrada.nextInt();

double preco;

switch (codigo) { 
       case 1:
		 preco=50*quantia;
           System.out.println("Conprou "+quantia+" bonés por " +preco); 
        break; 
       case 2: 
          preco=80*quantia;
           System.out.println("Conprou "+quantia+" calças por " +preco); 
        break; 
		       case 3: 
          preco=150*quantia;
           System.out.println("Conprou "+quantia+" tênis por " +preco); 
        break; 
       default: 
         System.out.println("Opção inválida"); 
} 
} 
}