/*
 * Creacion de un menu
 */
package menuvectores;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: MenuVectores
 * Version:1.0
 * Fecha: 18-04-2018
 * CopyRigth: Nathaly Perez
 * 
 * @author Nathaly Sarai Perez
 */
public class MenuVectores {
    
   
    
    public static void main(String[] args) {
        
        /*PORFA LEE ESTO ANTES DE COMENZAR SI EN ALGUN MOMENTO COMENTO EN INGLES LO SIENTO ES LA COSTUMBRE CUANDO
        TRABAJO CON MI AMIGO JJAJAJAJA Y SE ME OLVIDA OK */
        
     int opcion;
     do{
         opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion "
                 + "\n 1.Ingresar producto."
                 + "\n 2.Total."
                 + "\n 3.Salir"));//QUITE EL VALOR DE LA CAJA DE TEXTO QUE VALIA UNO
         switch(opcion)
         {
             case 1: 
                 llenado();
             break;
             case 2: 
                 procesamiento();
             break;
             case 3:
                 JOptionPane.showMessageDialog(null,"Que tenga un buen dia.");
                 System.exit(0);   
             break;
             default: 
                 JOptionPane.showMessageDialog(null,"Ingrese una opcion valida."); 
         }
         
     }while(opcion!=3);//CAMBIE A DIFERENTE DE 3 PARA QUE NO SE DETUVIERA ESTA OPCION TIENE QUE SER IGUAL AL NUMERO DE CASE
    }
    
    
    //start of functions for the program
    public static void llenado(){
        
        int cantidad, n=0;
        
        //number of employees
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados:"));
        
        //  vector declaration and variables
        String codigo[]= new String[cantidad];
        String nombre[]= new String[cantidad];
        int anio[]= new int[cantidad];
        String categoria[]= new String[cantidad];
        int nhoras[]= new int[cantidad];
        String direccion[]= new String[cantidad];
        double salario = 0, acu = 0;
        int cantempleados = 0, contedad = 0;
        int edad;
        double prosalario = 0;
        
        
        for(int i=0; i<cantidad; i++){
            codigo[i]=JOptionPane.showInputDialog("Ingrese el codigo del empleado: ");
            nombre[i]=JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
            anio[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento: "));
            categoria[i]=JOptionPane.showInputDialog("Ingrese la categoria: ");
            nhoras[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas del empleado: "));
            direccion[i]=JOptionPane.showInputDialog("Ingrese la direccion del empleado: ");
            
            n++;
           
          
           if("a".equals(categoria[i]) || "A".equals(categoria[i]))
           {
               salario=nhoras[i]*15;
               acu = acu+salario;
           }
           else if("b".equals(categoria[i]) || "B".equals(categoria[i]))
           {
               salario=nhoras[i]*13;
               cantempleados=cantempleados+1;
               acu = acu+salario;
           }
           else if("c".equals(categoria[i]) || "C".equals(categoria[i])){
               salario=nhoras[i]*10;
               acu = acu+salario;
           }
           
           edad=2018-anio[i];
           if(edad>50){
               contedad=contedad+1;
           }
           
           NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
           JOptionPane.showMessageDialog(null,"Datos"
                    + "\n Codigo: "+codigo[i]+
                       "\n Nombre: "+nombre[i]+
                       "\n Edad: "+edad+
                        "\n Categoria: "+categoria[i]+
                        "\n Numero de horas: "+nhoras[i]+
                        "\n Salario Final: "+nf.format(salario)+
                        "\n Direccion: "+direccion[i],"Datos por empleado",1);

    }
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        prosalario=acu/cantidad;
        JOptionPane.showMessageDialog(null,"Planilla"
                + "\n Monto total de planilla total a pagar: "+nf.format(acu)+
                "\n Promedio de todos los salarios: "+nf.format(prosalario)+
                "\n Cantidad de empleados categoria B: "+cantempleados+
                "\n Empleados mayores de 50 años: "+contedad,"Datos Generales",1);
      
    }
    
    public static void procesamiento(){
        
            
        }
}
