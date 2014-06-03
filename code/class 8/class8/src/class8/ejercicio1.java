/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8;

/**
 *
 * @author Home
 */
public class ejercicio1 {

    private String cadena;
    private String buscapalabra;

    public String alrevez() {
        String retorno = "";
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            retorno += getCadena().charAt(i);

        }
        return retorno;
    }

    public String palindromo() {
        String PalabraAlrevez = "";
        String cadena;
        String Cadena2 = "";

        PalabraAlrevez = getCadena();

        for (int i = getCadena().length() - 2; i >= 0; i--) {
            PalabraAlrevez += getCadena().charAt(i);

        }

        return PalabraAlrevez;

    }

    public String buscapalabra(String pPalabra) {
        String mensaje = "";
        String Subcadena = "";
        int inicioLetra = 0, finalLetra;
        for (int i = 0; i < getCadena().length(); i++) {
            if (getCadena().charAt(i) == ' ' || getCadena().length() - 1 == i) {
                finalLetra = i;
                if (getCadena().length() - 1 == i) {
                    Subcadena = getCadena().substring(inicioLetra);

                } else {
                    Subcadena = getCadena().substring(inicioLetra, finalLetra);

                } if(pPalabra.equals(Subcadena)){
                    mensaje+="-"+Subcadena+' ';
                    
                    
                } else {
                    mensaje+=Subcadena+" ";
                    inicioLetra=i+1;
                }
                    

            }

        }

        
        return mensaje;

    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
}
