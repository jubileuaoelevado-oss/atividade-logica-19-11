import java.util.Scanner; 
 
public class atividade2 { 

 public static void main(String[] args) { 
  Scanner entrada = new Scanner(System.in);
  
  double nota1;
  int presenca;
  
  System.out.println("Digite o valor da 1° nota: "); 
  nota1 = entrada.nextInt(); 
  System.out.println("Digite o percentual de presença 'sem o simbolo de porcentagem' : "); 
  presenca = entrada.nextInt();
  
   
if (nota1 >= 7) { 
       System.out.println("aprovado"); 
} else if (presenca >= 75) { 
       System.out.println("aprovado"); 
} else { 
   System.out.println("reprovado"); 
} 
} 
}