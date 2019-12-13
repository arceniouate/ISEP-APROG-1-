package gameland;
import static gameland.Configuracoes.N_JOGOS;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Formatter;
/**
 *
 * @author Arcenio
 */
public class Main {
 private static int menu() {
        Scanner lr = new Scanner(System.in);
        Formatter oj = new Formatter(System.out);
        System.out.println("============GAMELAND=============");
        String texto = "==============MENU=============="
                + "\n 1 - Ler info jogos                 "
                + "\n 2 - Visualizar info jogos          "
                + "\n 3 - Ler info participantes         "
                + "\n 4 -Visualizar info participantes   "
                + "\n 0 -Fim                             "
                + "\nQual e a sua opção!";
        oj.format("%n%s%n", texto);
        return new Scanner(System.in).nextInt();
    }
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner lr = new Scanner(System.in);
        Formatter oj = new Formatter(System.out);
        String[] jogos = new String[Configuracoes.N_JOGOS];
    String[][] participantes=new String[Configuracoes.MAX_PARTICIPANTES ][Configuracoes.N_CAMPOS_INFO]; 
        int nparticipante=0;
        int op;
        do {
            op = menu();
            switch (op) {

                case 1:
                    System.out.println("Insira o caminho abdoluto do ficheiro");
                   String   nomeFich = lr.next();

                    if (LerFichJogo.caregarJogosDoEvento(nomeFich, jogos)) {
                        System.out.println("Jogos carregados com sucesso");
                    } else {
                        System.out.println("Caregamento falhado ");
                    }
                    break;
                case 2:
                    LerFichJogo.visualizarInfoJogos(jogos);
                    break;
                case 3:
                    System.out.println("Insira o caminho absoluto do ficheiro");
                    String nomeFicheiro=lr.next();
                    nparticipante=lerFichParticipantes.lerInfoFicheiroComRegistoErros(nomeFicheiro, participantes, nparticipante);
                    System.out.println("Ficheiro  com sucesso");
                    break;
                case 4:
                     lerFichParticipantes .listagemPaginada(participantes, nparticipante);
                    break; 
            }
        } while (op != 0);

    }

}