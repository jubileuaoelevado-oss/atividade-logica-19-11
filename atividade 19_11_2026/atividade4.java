import java.util.Scanner; 
 
public class atividade4 { 

 public static void main(String[] args) { 
  Scanner entrada = new Scanner(System.in);
  
  double nota1;
  int presenca;
  
  System.out.println("Digite o valor da 1° nota: "); 
  nota1 = entrada.nextInt(); 
  System.out.println("Digite o percentual de presença 'sem o simbolo de porcentagem' : "); 
  presenca = entrada.nextInt();
  
   
if (nota1 >= 6) { 
	if(nota1 >=10){
	System.out.println("destaque");
	}else {
		System.out.println("aprovado");
	} 
} else if (presenca >= 75) { 
       System.out.println("recuperação"); 
} else { 
   System.out.println("reprovado"); 
} 
} 
}