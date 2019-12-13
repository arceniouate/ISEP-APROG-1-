package gameland;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Arcenio
 */
public class lerFichParticipantes {

    private final static String FILE_LOG_ERROS_PARTICIPANTES = "ErrosParticipantes.txt";
    /*
     public static int lerFichRErros(String nomeFicheiro, String[][] matriz, int nEle) throws FileNotFoundException{
     //Referncia para o File log de Erros 
     Formatter logErros = LogErros.criarSbrirFileLogErros(FILE_LOG_ERROS_PARTICIPANTES);
     //Ler o ficheiro atravez da classe Scanner
     Scanner ln = new Scanner(new File(nomeFicheiro));
     //  int nElslnic=nEle;
     while (ln.hasNext() && nEle < Configuracoes.MAX_PARTICIPANTES) {
     //percorrer cada linha do ficheiro
     String linha = ln.nextLine();
     // se a linha não esta em branco trata se-a  
     if (linha.length() > 0) {
     nEle = guardarEle(linha, matriz, nEle, logErros);
     }

     }
     ln.close();
     // if(nEle-nElslnic!=3){
     // nEle=nElslnic;
     //  LogErros.registarErro(logErros,"","Os numero e elementos da equipa esta incorreto");
     //}
     LogErros.fecharFileLogErros(logErros);
     return nEle;}*/

    public static int lerInfoFicheiroComRegistoErros(String nomeFich, String[][] participantes, int nPartic) throws FileNotFoundException {
      int nElsInic=nPartic;
        // Referência para o File Log de Erros Deputados
        Formatter logErros = LogErros.criarSbrirFileLogErros(FILE_LOG_ERROS_PARTICIPANTES);
        Scanner fInput = new Scanner(new File(nomeFich));
        while (fInput.hasNext()) {
            String linha = fInput.nextLine();
            // Se linha não está em branco trata-a
            if (linha.length() > 0) {
                nPartic = guardarEle(linha, participantes, nPartic, logErros);
            }
        }
        fInput.close();
        if (nPartic - nElsInic != 3) {
            nPartic = nElsInic;
        }
        LogErros.registarErro(logErros, " ", "O número de elementos da equipa está incorreto");
        LogErros.fecharFileLogErros(logErros);
        return nPartic;
    
}

private static int guardarEle(String linha, String[][] matriz, int nEle, Formatter logErros) throws FileNotFoundException {
        String[] temp = linha.split(Configuracoes.SEPARADORP);
        if (temp.length != Configuracoes.N_CAMPOS_INFO) {
            LogErros.registarErro(logErros, linha, "Linha incorreta n de campos!");
        }else{
            String num=temp[0].trim();
            int pos =pesquisarElemento(num,  nEle,  matriz);
            //if(pos!=-1){
               // LogErros.registarErro(logErros, linha, "Linha incorreta porque o email já existe");
           // }else{
                for(int i=0;i<Configuracoes.N_CAMPOS_INFO;i++){
                    matriz[nEle][i]=temp[i].trim();
                 
                }
                nEle++;
                 
}
            
           
        
        return nEle;

    }

    /**
     * Pesquisar linha de matriz por primeiro elemento da linha
     *
     * @param valor - elemento a pesquisar
     * @param nEl - nº de elementos da matriz
     * @param matriz - matriz com a informação
     * @return -1 se não existe linha com esse valor ou o nº da linha cujo
     * primeiro elemento é esse valor
     */
    public static int pesquisarElemento(String valor, int nEl, String[][] matriz) {
        for (int i = 0; i < nEl; i++) {
            if (matriz[i][0].equals(valor)) {
            } else {
                return i;
            }
        }
        return -1;
    }

 
    public static void listagemPaginada(String[][] matriz, int nEle) {

        int contPaginas = 0;
        for (int i = 0; i <nEle; i++) {
            if (i % Configuracoes.MAX_LINHAS_PAGINA == 0) {
                if (contPaginas > 0) {
                    pause();
                }
                contPaginas++;
                System.out.println("\nPÁGINA: " + contPaginas);
                cabecalho();
            }
            for (int j = 0; j < Configuracoes.N_CAMPOS_INFO; j++) {
                if (j == 1) {
                    System.out.printf("|  %30s", matriz[i][j]);
                    
                } else {
                    System.out.printf("|  %15s", matriz[i][j]);
                }
            }
            System.out.println("|");
        }
        System.out.printf("%s%n", "+-----------------+--------------------------------+-----------------+-----------------+");
        pause();
    }

  
    private static void cabecalho() {
        System.out.printf("%50s%n", "PARTICIPANTES");
        System.out.printf("%s%n", "+-----------------+--------------------------------+-----------------+-----------------+");
        System.out.printf("| %15s ", "NÚMERO de SÓCIO");
        System.out.printf("| %30s ", "NOME do SÓCIO");
        System.out.printf("| %15s", "MARCA da VIATURA");
        System.out.printf("| %15s ", "ANO de FABRICO ");
        System.out.println("|");
        System.out.printf("%s%n", "+-----------------+--------------------------------+-----------------+-----------------+");
    }
    private static void pause() {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s%n", "+-----------------+--------------------------------+-----------------+-----------------+");
        System.out.println("\n\nPara continuar digite ENTER\n");
        in.nextLine();
    }

}
