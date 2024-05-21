import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception{
        try {

        Scanner Scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o primero número: ");
        int n1 = Scan.nextInt();
    
        System.out.println("Informe o segundo número: ");
        int n2 = Scan.nextInt();
    
        contarNumeros(n1, n2);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("Segundo parâmetro deve ser maior que o primeiro");
        
        }


       
    }
    static void contarNumeros(int n1, int n2) throws ParametrosInvalidosException {
        if (n2 < n1){
            throw new ParametrosInvalidosException ();
        }
        int contar = n2 - n1;
        for (int x = 1; x <= contar; x++) {
            System.out.println("Contagem: "+ x);
        }
    }
}
