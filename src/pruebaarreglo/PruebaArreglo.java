
package pruebaarreglo;

public class PruebaArreglo {

    public static void main(String[] args) {
        
int arreglo[]={71,0,2,13,37};
int matriz[][]={{15,18,66},{24,27}};
String frase="La vida es bella";

Arreglo.sumarLista(arreglo);
System.out.println("El numero mayor del arreglo bidimensional es: "+Arreglo.buscarMayor(matriz));
System.out.println("La frase posee: "+Arreglo.cuentaVocales(frase)+" vocales");
System.out.println("Y ademas posee: "+Arreglo.cuentaCaracter(frase,'a')+" veces la letra a");
    }
    
}
