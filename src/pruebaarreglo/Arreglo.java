
package pruebaarreglo;


public class Arreglo {
    
    public static void sumarLista(int a[]){
    int suma=0;
    int promedio;
    for(int i=0;i<a.length;i++){
    suma+=a[i];
    }
    System.out.println("La suma de los numeros del arreglo es: "+suma);
    promedio=suma/a.length;
    System.out.println("El promedio de los numeros del arreglo es: "+promedio);
    }
    
    public static int buscarMayor(int m[][]){ 
        int mayor=m[0][0];
        for (int f=0;f<m.length;f++){
            for (int c=0;c<m[f].length;c++){
                if(mayor<m[f][c]){
                    mayor=m[f][c];
                }
            }
        }
        return mayor;
    }
    
    public static int cuentaVocales (String a){
        int cantidad=0;
        for(char it:a.toCharArray()){
        if(it=='a'||it=='e'||it=='i'||it=='o'||it=='u'){
        cantidad++;
        }
        }
        return cantidad;
    }
    
    public static int cuentaCaracter(String s, char c){
    int cantidad=0;
    for(char it:s.toCharArray()){
    if(it==c){
    cantidad++;
    }
    }
    return cantidad;
    }

}
