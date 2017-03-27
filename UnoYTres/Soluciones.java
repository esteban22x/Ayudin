
package desarrollo;


public class Soluciones {
    
    
    /*
    * 10) Determinar si una matriz es la identidad
    */
    public void determinarIdentidad(int[][] matriz)
    {
        boolean errorBandera=false;
        int i=0,sumaUno=0,sumaCero=0;
        for (;i < matriz.length; i++) {
            if (errorBandera){
                System.err.println("La matriz ingresada no es binaria");
                break;
            }
            for (int j=0;j < matriz.length; j++) {
                if (i==j && matriz[i][j]==1)
                    sumaUno++;
                else if (matriz[i][j]==0)
                    sumaCero++;
                else
                    errorBandera=true;
            }
        }
        if (sumaUno==matriz.length && sumaCero==(i*i)-matriz.length && !errorBandera)
            System.out.println("La matriz es identidad");
        else if (!errorBandera)
            System.out.println("La matriz no es identidad");
            
    }
    
    /*
    * Intercambiar el primer y ultimo digito de un numero 
    * Ejemplo: Entrada: 143 - Salida: 341
    */
    public int intercambiarNumero(int numero)
    {
        int ultimoNumero,primerNumero=0,digitos=-1;
        ultimoNumero=numero%10;
        for (int numeroAux = numero;numeroAux!=0;numeroAux/=10,digitos++)
            primerNumero=numeroAux%10;digitos++;
        if (digitos<2)
            return -1;
        //Final del numero
        numero-=ultimoNumero;
        numero+=primerNumero;
        //Inicio del numero 
        numero-=Math.pow(10*primerNumero, digitos-1);
        numero+=Math.pow(10*ultimoNumero, digitos-1);
        return numero;
    }
}
