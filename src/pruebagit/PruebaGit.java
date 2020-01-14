/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

/**
 *
 * @author alba
 */
public class PruebaGit {
    
    private String quita(String cadena) {
        String auxiliar = " ";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                auxiliar = auxiliar + cadena.charAt(i);

            }
        }
        return auxiliar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //https://github.com/alba9413/PruebaGit.git
        //he añadidio un metodo que quita espacios
    }
    
}
