package ejerciciosbasicosdejava;

/**
 *
 * @author Alejandro Serrano Loredo
 */
public class EjerciciosBasicosDeJava {

    public boolean fiestaArdillas(int numeroBellotas, boolean finDeSemana) {

        return numeroBellotas >= 40 && numeroBellotas <= 60 || finDeSemana;
    }

    public int multa(int velocidad, boolean cumpleaños) {
        if (cumpleaños) {
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
        
        
    }

}
