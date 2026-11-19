import java.util.Scanner; 
 
public class atividade1  { 
 public static void main(String[] args) { 
 
  Scanner entrada = new Scanner(System.in); 
  
  int idade; 
  
  System.out.println("Digite sua idade: "); 
  idade = entrada.nextInt(); 

if (idade >= 65) { 
       System.out.println("entrada gratis"); 
} else if (idade <= 12) { 
       System.out.println("entrada gratis"); 
} 
}
} 