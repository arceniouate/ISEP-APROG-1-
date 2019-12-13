/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameland;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Arcenio
 */
public class LogErros {
    /***
     * cria e abre um ficheiro de texto  para escrita 
     * @param nomeFich nome do ficheiro com info errod 
     * @return
     * @throws FileNotFoundException 
     */
    public static Formatter criarSbrirFileLogErros(String nomeFich) throws FileNotFoundException{
        // abrir o ficheiro para a leitura 
        Formatter outErr=new Formatter(new File(nomeFich));
        return outErr;
    }
    /****
     * regista um erro num ficheiro
     * @param outErr nome do ficheiro 
     * @param linha linha onde foi identificado
     * @param tipoErro tipo de erro identificado 
     */
     public static  void registarErro( Formatter  outputLogErros,String linha,String tipoErro){
          outputLogErros.format("%s---%s%n", linha, tipoErro);
     }
     
    public static void fecharFileLogErros(Formatter outputLogErros) {
        outputLogErros.close();
    }
     public static void listarFileLogErros(String nomeFile) throws FileNotFoundException {
        Scanner outputLogErros = new Scanner(new File(nomeFile));
        while (outputLogErros.hasNextLine()) {
            System.out.println(outputLogErros.nextLine());
        }
        outputLogErros.close();
    }
}
