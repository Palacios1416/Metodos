import java.util.Scanner;
public class App {
    static final double Taza_Antiguedad = 0.15;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese su salario bruto:  ");
        double ingreso_Bruto=scan.nextInt();
        Ingresos(ingreso_Bruto);
    }
    public static void Ingresos(double ingreso_Bruto){
        double ingreso_Anti = Taza_Antiguedad * ingreso_Bruto;

        int ingreso_total = ingreso_Bruto + ingreso_Anti;
        deduccionesTotales = Deducciones();
        int ingreso_neto = ingreso_total - deduccionesTotales;

        int ingreso_Anti = ingreso_Bruto;
        Deducciones(ingreso_Anti);
    }

    public static void Deducciones(int ingreso_Anti){
        double result = ingreso_Anti * Taza_Antiguedad;
    }
    
}
