import java.util.Scanner; 
 
public class atividade6 { 
public static void main(String[] args) { 
Scanner entrada = new Scanner(System.in);



System.out.println("turno"); 
int turno = entrada.nextInt();

System.out.println("diciplina"); 
int diciplina = entrada.nextInt();


switch (turno) { 
       case 1:
		 switch (diciplina) { 
       case 1:
		 System.out.println("matematica"); 
        break;
		case 2:
		System.out.println("portugues"); 
		break;
		default: 
         System.out.println("Opção inválida");
		 }
        break; 
       case 2: 
         switch (diciplina) { 
       case 1:
		 System.out.println("historia"); 
        break;
		default: 
         System.out.println("Opção inválida");
		 }
        break; 
		     		default: 
         System.out.println("Opção inválida");
		 } 
} 
} 
