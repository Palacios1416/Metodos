import java.util.Scanner;
public class App {
    static final float Taza_Antiguedad = 0.15F;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese su salario bruto:  ");
        float ingreso_Bruto=scan.nextInt();
        Ingresos(ingreso_Bruto);
    }
    public static void Ingresos(float ingreso_Bruto){
        float ingreso_Anti = Taza_Antiguedad * ingreso_Bruto;
        float ingreso_total = ingreso_Bruto + ingreso_Anti;
        // deduccionesTotales = Deducciones();
        // int ingreso_neto = ingreso_total - deduccionesTotales;

        // int ingreso_Anti = ingreso_Bruto;
        
    }

    public static void Deducciones(){
        
    }
    
}
