
package gameland;

import static gameland.Configuracoes.N_JOGOS;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
/**
 *
 * @author Arcenio
 */
public class LerFichJogo {
 /**
     * **
     * o o presente metodo vai caregar os jogos do Envento
     *
     * @param nomeFicheiro nome do ficheiro
     * @param jogos vetor com o tiop de jogos
     * @return
     * @throws FileNotFoundException
     */
    public static boolean caregarJogosDoEvento(String nomeFicheiro, String[] jogos) throws FileNotFoundException {
        // abrir o ficheiro para leitura 
        Scanner lr = new Scanner(new File(nomeFicheiro));
        int i = 0;
        while (lr.hasNext() && i < Configuracoes.N_JOGOS) {
            //ler a variavel aux do ficheiro 
            String linha = lr.nextLine();
            //verificar   se alinhas em brancas 
            if ((linha.trim()).length() > 0) {
                jogos[i] = linha;
                i++;
            }
        }
        lr.close();
        if (i == N_JOGOS) {
            return true;
        }
        return false;
    }

    /**
     * *
     * O presente metodo vai visualizar na consola os jogos caregados na memoria
     *
     * @param vec com os jogos que seram mostrados no ecram
     */
    public static void visualizarInfoJogos(String[] vec) {
        System.out.println("=====JOGOS DO EVENTOS=====");
        System.out.printf("%15s%15s%15s%n","ID do jogo", "Tipo de jogo", "Max. de pontos");
        for (int i = 0; i < vec.length; i++) {
            String[]temp=vec[i].split("-");
                    System.out.printf("%15s%15s%15s%n",temp[0],temp[1],temp[2]);
        }

    }

}
