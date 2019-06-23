/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere;

/**
 *
 * @author tarod
 */
public class Vigenere {

    public static final char[][] POLI_ALFABETO;
    
    static {
        char[][] poliAlfabeto = new char[26][26];
        for(int row = 0; row < 26; row++)
            for(int i = row, col = 0; i < 26 + row && col < 26; i++, col++)
//                if(row == 0 || col == 0)
                    poliAlfabeto[row][col] = (char)((i % 26) + 65);
//                else poliAlfabeto[row][col] = (char)(i + 666);
        
        POLI_ALFABETO = poliAlfabeto;
    }
    
    private Vigenere() {}

    public static String cifrar(String clave, String frase) {
        clave = clave.toUpperCase().replaceAll(" ", "");
        frase = frase.toUpperCase().trim();
        int claveLen = clave.length();
        int fraseLen = frase.length();
        String fraseCifrada = "";        
        
        for(int i = 0; i < fraseLen; i++) {
            char caracterFrase = frase.charAt(i);
            
            if(caracterFrase == ' ') fraseCifrada += ' ';
            else fraseCifrada += POLI_ALFABETO[(clave.charAt(i % claveLen) - 65)]
                                              [(caracterFrase - 65)];
        }
        
        return fraseCifrada;
    }
    
    public static String descifrar(String clave, String fraseCifrada) {
        clave = clave.toUpperCase().replaceAll(" ", "");
        fraseCifrada = fraseCifrada.toUpperCase().trim();
        int claveLen = clave.length();
        int fraseCifradaLen = fraseCifrada.length();
        String frase = "";        
        
        for(int i = 0; i < fraseCifradaLen; i++) {
            char caracterFrase = fraseCifrada.charAt(i);
            char[] linea = POLI_ALFABETO[(clave.charAt(i % claveLen) - 65)];
            
            if(caracterFrase == ' ') frase += ' ';
            else
                for(int j = 0; j < linea.length; j++)
                    if(linea[j] == caracterFrase) frase += POLI_ALFABETO[0][j];
        }
        
        return frase;
    }
    
}