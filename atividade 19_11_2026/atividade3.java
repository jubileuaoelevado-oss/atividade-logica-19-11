import java.util.Scanner; 
 
public class atividade3 { 

 public static void main(String[] args) { 
  Scanner entrada = new Scanner(System.in);
  
  double idade;

  
  System.out.println("Digite o valor da idade: "); 
  idade = entrada.nextInt(); 

  
   
if (idade <=12) { 
       System.out.println("infantil"); 
} else if (idade >=59) { 
       System.out.println("adulto"); 
} else { 
   System.out.println("idoso"); 
} 
} 
}