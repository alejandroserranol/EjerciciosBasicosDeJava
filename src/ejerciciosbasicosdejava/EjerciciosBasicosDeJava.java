package ejerciciosbasicosdejava;

/**
 *
 * @author Alejandro Serrano Loredo
 */
public class EjerciciosBasicosDeJava {

    public boolean fiestaArdillas(int numeroBellotas, boolean finDeSemana) {

        if (!finDeSemana) {
            if (numeroBellotas >= 40 && numeroBellotas <= 60) {
                return true;
            }
        } else {
            if (numeroBellotas >= 40) {
                return true;
            }
        }

        return false;
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
        return numero % 11 == 0 || numero - 1 % 11 == 1;
    }

    public boolean contesta(boolean matinal, boolean madre, boolean dormido) {
        if (matinal && !madre) {
            return false;
        }
        if (dormido) {
            return false;
        }
        return true;
    }

    public boolean menorPor10(int a, int b, int c) {
        if ((Math.abs(a - b) >= 10) || (Math.abs(a - c) >= 10) || (Math.abs(b - c) >= 10)) {
            return true;
        }

        return false;
    }

    public boolean digitoIgual(int a, int b) {
        if (a / 10 == b / 10 || a / 10 == a % 10 || a % 10 == b / 10) {
            return true;
        }

        return false;
    }

    public boolean multiploMultiple(int a) {
        if (a % 3 == 0 && a % 5 != 0 || a % 3 != 0 && a % 5 == 0) {
            return true;
        }
        return false;
    }
    
    public boolean menos20(int a) {
        if ( (a+1) % 20 == 0 || (a+2) % 20 == 0 ) {
            return true;
        }
        return false;
    }
    
    public int loteria(int a, int b, int c) {
        if(a==b && a==c && a==2){
            return 10;        
        }
        if(a==b && a==c && a!=2){
            return 5;        
        }
        if(a != b && a != c ){
            return 1;        
        }
        return 0;
    }
    
    public int withoutDoubles(int a, int b, boolean equals) {
        if(equals && a==b){
            return a+b+1;
        }
       
        return a+b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EjerciciosBasicosDeJava ejercicios = new EjerciciosBasicosDeJava();

        //Primer ejercicio
//          System.out.println("Ejercicio fiestaArdillas");
//        System.out.println("¿La fiesta ha sido un éxito? -> " + ejercicios.fiestaArdillas(30, false));
//        System.out.println("¿La fiesta ha sido un éxito? -> " + ejercicios.fiestaArdillas(50, false));
//        System.out.println("¿La fiesta ha sido un éxito? -> " + ejercicios.fiestaArdillas(70, true));
        System.out.println("");

        //Segundo ejercicio
//        System.out.println("Ejercicio multas");
//        System.out.println("Señor agente, ¿me ha puesto una multa? -> " + ejercicios.multa(60, false));
//        System.out.println("Señor agente, ¿me ha puesto una multa? -> " + ejercicios.multa(65, false));
//        System.out.println("Señor agente, ¿me ha puesto una multa? -> " + ejercicios.multa(65, true));
        System.out.println("");

        //Tercer ejercicio
//        System.out.println("Múltiplo de 11");
//        System.out.println("¿Es múltiplo de 11 o es uno más de un múltiplo de 11? -> " + ejercicios.muyVanidoso(22));
//        System.out.println("¿Es múltiplo de 11 o es uno más de un múltiplo de 11? -> " + ejercicios.muyVanidoso(23));
//        System.out.println("¿Es múltiplo de 11 o es uno más de un múltiplo de 11? -> " + ejercicios.muyVanidoso(24));
        //Cuarto ejercicio
//        System.out.println("");
//        System.out.println("Móvil que suena");
//        System.out.println("¿Me apetece cogerte el telefono? -> " + ejercicios.contesta(false, false, false));
//        System.out.println("¿Me apetece cogerte el telefono? -> " + ejercicios.contesta(false, false, true));
//        System.out.println("¿Me apetece cogerte el telefono? -> " + ejercicios.contesta(true, false, false));
        //Quinto ejercicio
        System.out.println("");
        System.out.println("menor por 10");
        System.out.println("¿hay alguna diferencia superior a 10? -> " + ejercicios.menorPor10(1, 7, 11));
        System.out.println("¿hay alguna diferencia superior a 10? -> " + ejercicios.menorPor10(1, 7, 10));
        System.out.println("¿hay alguna diferencia superior a 10? -> " + ejercicios.menorPor10(11, 1, 7));

        //Sexto ejercicio
        System.out.println("");
        System.out.println("digito igual");
        System.out.println("¿hay digito igual? -> " + ejercicios.digitoIgual(12, 23));
        System.out.println("¿hay digito igual? -> " + ejercicios.digitoIgual(12, 43));
        System.out.println("¿hay digito igual? -> " + ejercicios.digitoIgual(12, 44));

        //Septimo ejercicio
        System.out.println("");
        System.out.println("Múltiplo múltiple");
        System.out.println("Múltiplo múltiple -> " + ejercicios.multiploMultiple(3));
        System.out.println("Múltiplo múltiple -> " + ejercicios.multiploMultiple(10));
        System.out.println("Múltiplo múltiple -> " + ejercicios.multiploMultiple(15));
        
        //Octavio ejercicio
        System.out.println("");
        System.out.println("menos20");        
        System.out.println("Múltiplo múltiple -> " + ejercicios.menos20(18));
        System.out.println("Múltiplo múltiple -> " + ejercicios.menos20(19));
        System.out.println("Múltiplo múltiple -> " + ejercicios.menos20(20));
        
        //Noveno ejercicio
        System.out.println("");
        System.out.println("loteria");
        System.out.println("¿Cuánto he ganado? -> " + ejercicios.loteria(2, 2, 2));
        System.out.println("¿Cuánto he ganado? -> " + ejercicios.loteria(2, 2, 1));
        System.out.println("¿Cuánto he ganado? -> " + ejercicios.loteria(0, 0, 0));
        
         //Decimo ejercicio
        System.out.println("");
        System.out.println("withoutDoubles");
        System.out.println("¿withoutDoubles? -> " + ejercicios.withoutDoubles(2, 3, true));
        System.out.println("¿withoutDoubles? -> " + ejercicios.withoutDoubles(3, 3, true));
        System.out.println("¿withoutDoubles? -> " + ejercicios.withoutDoubles(3, 3, false));
        System.out.println("¿withoutDoubles? -> " + ejercicios.withoutDoubles(6, 6, true));

    }

}
