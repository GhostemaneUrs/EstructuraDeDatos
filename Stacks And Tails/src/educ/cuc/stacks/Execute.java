
package educ.cuc.stacks;

import static educ.cuc.stacks.Stacks.getString;
import static educ.cuc.stacks.Stacks.validarExpresion;

/* Esto clase se usara para probar nuestros metodos de Stacks
 */
public class Execute {
     public static void main(String[] args) throws Exception {
//        Stacks<Integer> stacks = new Stacks<>();
//        
//        System.out.println("-----------------");
//        
//        stacks.push(1);
//        stacks.push(2);
//        stacks.push(3);
//        stacks.push(4);
//
//        System.out.println(stacks);
//        stacks.pop();
//        System.out.println(stacks);
//        System.out.println("El elemento obtenido es");
//        stacks.peek();
         
         String cadena = getString("datos.txt");
         System.out.println("La cadena es: " + cadena);
         if (validarExpresion(cadena)) {
             System.out.println("Todo esta bien en la cadena");
         }else{
             System.out.println("Todo esta mal en la cadena");
         }
    }
     
    
}
