/*
 Hcaer un proyecto que lea el numero de horas trabajadas, valor de la hora y 
los años que lleva un empleado en la empresa y luego imprima su salario neto
las deducciones, auxilio de transporte y la bonificacion (depende de la cantidad de años que lleva 
empleado en la empresa: menor o igual a 3 años le da una bonificacion mensual de 100000, entre 3 y 5
años la bonificacion es de 150000 y de 200000 si lleva mas de 5 años)
 */
package salario_encapsulamiento;

import java.util.Scanner;


public class Salario_Encapsulamiento {

   
    public static void main(String[] args) {
        //Definicion de objetos y variables
        Scanner objleer = new Scanner(System.in);
        ClsSalario objsalario = new ClsSalario();
        int nro_horas, antiguedad;
        float val_hora;
        
        //Lectura datos de entrada
        System.out.println("Digite el nro de horas laboradas: ");
        nro_horas=objleer.nextInt();
        
        System.out.println("Digite el valor de la hora: ");
        val_hora=objleer.nextFloat();
        
        System.out.println("Digite la antiguedad que lleva en la empresa: ");
        antiguedad=objleer.nextInt();
        
        //Envie la informacion encapsulada a la clase
        objsalario.setNro_horas(nro_horas);
        objsalario.setVal_hora(val_hora);
        objsalario.setAntiguedad(antiguedad);
        
        objsalario.clacular_salario();
        
        //Imprimir resultados
        System.out.println("\n El salario bruto es: " + objsalario.getSal_bruto());
        System.out.println("\n Las deducciones son: " + objsalario.getDeducciones());
        System.out.println("\n El auxilio de transporte es: " + objsalario.getAux_transporte());
        System.out.println("\n Las bonificaviones: " + objsalario.getBonificacion());
        System.out.println("\n el salario neto es : " +objsalario.getSal_neto());
        
    }
    
}
