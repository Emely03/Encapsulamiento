/* Crear un metodo para calcular el salario bruto, las deducciones, auxilio de transporte
y las bonificaciones, los datos de entrada son las horas trabajadas, el valor de la hora y el
tiempo laborado en la empresa
 */
package salario_encapsulamiento;

import java.util.Scanner;
//lo que entra se llama setter y lo que sale getter

public class ClsSalario {
  private int nro_horas;
  private float val_hora;
  private int antiguedad;
  private float sal_bruto;
  private float deducciones;
  private float aux_transporte;
  private float bonificacion;
  private float sal_neto;

    public void setNro_horas(int nro_horas) {
        this.nro_horas = nro_horas;
    }

    public void setVal_hora(float val_hora) {
        this.val_hora = val_hora;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public float getSal_bruto() {
        return sal_bruto;
    }

    public float getDeducciones() {
        return deducciones;
    }

    public float getAux_transporte() {
        return aux_transporte;
    }

    public float getBonificacion() {
        return bonificacion;
    }

    public float getSal_neto() {
        return sal_neto;
    }
  
    public void clacular_salario(){
        sal_bruto=nro_horas*val_hora;
        if (sal_bruto <=4*1000000){
            deducciones=sal_bruto*8/100;
            
            if(sal_bruto <=2*1000000)
                aux_transporte = 117000;
            else 
                aux_transporte = 0;
        }
        else{
        aux_transporte = 0;
        deducciones = sal_bruto * 9/100; 
        }
        if (antiguedad <=2)
            bonificacion=100000;
        else 
            if (antiguedad<=5)
                bonificacion=150000;
            else 
                bonificacion = 200000;
        sal_neto = sal_bruto - deducciones + aux_transporte + bonificacion;
    }
}
  


