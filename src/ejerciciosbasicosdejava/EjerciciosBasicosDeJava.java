package ejerciciosbasicosdejava;

/**
 *
 * @author Alejandro Serrano Loredo
 */
public class EjerciciosBasicosDeJava {

    public boolean fiestaArdillas(int numeroBellotas, boolean finDeSemana) {

        return numeroBellotas >= 40 && numeroBellotas <= 60 || finDeSemana;
    }

    public int multa(int velocidad, boolean birthday) {
        if (birthday) {
            if (velocidad > 65 && velocidad <= 85) {
                return 1;
            }
            if (velocidad > 85) {
                return 2;
            }
        } else {
            if (velocidad > 60 && velocidad <= 80) {
                return 1;
            }
            if (velocidad > 80) {
                return 2;
            }
        }
        return 0;
    }
    
    public boolean muyVanidoso(int numero) {
        if(numero % 11 == 0 || (numero-1)%11 ==0){
            return true;        
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        EjerciciosBasicosDeJava ejercicios = new EjerciciosBasicosDeJava();
        
            //Primer ejercicio
        System.out.println("Ejercicio fiestaArdillas");
        System.out.println("¿La fiesta ha sido un éxito? -> " + ejercicios.fiestaArdillas(30, false));
        System.out.println("¿La fiesta ha sido un éxito? -> " + ejercicios.fiestaArdillas(50, false));
        System.out.println("¿La fiesta ha sido un éxito? -> " + ejercicios.fiestaArdillas(70, true));
        
        System.out.println("");
        
            //Segundo ejercicio
        System.out.println("Ejercicio multas");
        System.out.println("Señor agente, ¿me ha puesto una multa? -> " + ejercicios.multa(60, false));
        System.out.println("Señor agente, ¿me ha puesto una multa? -> " + ejercicios.multa(65, false));
        System.out.println("Señor agente, ¿me ha puesto una multa? -> " + ejercicios.multa(65, true));
        
        System.out.println("");
        
            //Tercer ejercicio
        System.out.println("Múltiplo de 11");
        System.out.println("¿Es múltiplo de 11 o es uno más de un múltiplo de 11? -> " + ejercicios.muyVanidoso(22));
        System.out.println("¿Es múltiplo de 11 o es uno más de un múltiplo de 11? -> " + ejercicios.muyVanidoso(23));
        System.out.println("¿Es múltiplo de 11 o es uno más de un múltiplo de 11? -> " + ejercicios.muyVanidoso(24));
        
        
    }

}
