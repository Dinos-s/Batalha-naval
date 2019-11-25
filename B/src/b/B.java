/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author leonardo ramos
 */
public class B {
     public static final Tabuleiro[][] tabuleiro = new Tabuleiro[10][10];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File arquivo = new File("tabuleiro.txt");
        int[] embarcacoes = new int[11];

        inicializarTabuleiro('0');
//       load lendo o arquivo
        loadTabuleiro(arquivo, embarcacoes);

//um while dentro dentro do outro para loopar o atirar até todas as
//enbarcacoes dentro do vetor ser 0
//gerar log
//encenrrar aplicativo após gerado o log ou seja finalizar o primeiro while
        boolean on = true;
        Scanner canhao88mm = new Scanner(System.in);
        while (on) {
            imprimirTabuleiro();
            System.out.println("Informe as coordenadas de X: ");
            int x = canhao88mm.nextInt();
            System.out.println("Informe as coordenadas de Y: ");
            int y = canhao88mm.nextInt();
            atirar(x, y, embarcacoes);
        }

    }

    public static void inicializarTabuleiro(char casa) {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                tabuleiro[x][y] = new Tabuleiro();
                tabuleiro[x][y].casa = casa;
            }
        }

    }

    public static void loadTabuleiro(File arquivo, int[] embarcacoes) {
//        percorrer todas as linhas do arquivo
        try {
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] valores = new String[4];
                valores = linha.split(" ");
                tabuleiro[Integer.parseInt(valores[0])][Integer.parseInt(valores[1])].casa = valores[2].charAt(0);
                tabuleiro[Integer.parseInt(valores[0])][Integer.parseInt(valores[1])].iEmbarcacao = Integer.parseInt(valores[3]);
                embarcacoes[Integer.parseInt(valores[3])]++;
            }
        } catch (Exception e) {

        }
    }

    public static int verificarTabuleiro(char tabuleiro[], int x, int y, char embarcacao) {
//        verifica o tabuleiro volta 1 se certo 0 se errado
/*
TODO:
a. ultrapassa os limites do tabuleiro;
b. utiliza uma casa já ocupada;
c. encosta em uma outra embarcação.

         */
        return 1;
    }
    //variaveis para obter informações sobre os tiros
 // dentro de cada case vai obtendo numeros sobre os tiros
static int tiros=0,agua=0,certos=0,repetidos=0,invalidos=0;
static int submarino=0,destroyer=0,cruzador=0,portaviao=0;
        
    public static int atirar(int x,int y,int[] embarcacoes) {
        //        atirar em x e y
        //  verificar aonde o tiro está indo
        if (tabuleiro[x][y].secret == false) {
            System.out.println("Tiro repetido");
            //Retorna 1 caso o tiro seja inválido ou repetido
            repetidos++;
            System.out.println(repetidos);
            return 1;
        }
        switch(tabuleiro[x][y].casa){
            case 'X':
                System.out.println("Você acertou a água! ");
                tabuleiro[x][y].secret = false;
                agua++; 
                break;
         case 'S':
                System.out.println("Você acertou um Submarino! ");
                System.out.println("Hp antes do tiro: "+embarcacoes[tabuleiro[x][y].iEmbarcacao]);
                tabuleiro[x][y].secret = false;
                embarcacoes[tabuleiro[x][y].iEmbarcacao]--;
                System.out.println("Hp dps do tiro: " +embarcacoes[tabuleiro[x][y].iEmbarcacao]);
                certos++;
                submarino++;
                if (submarino==1){
                    System.out.println("Afundou um submarino");
                    
                }
               
                break;
        
       case 'D':
                System.out.println("Você acertou um Destroyer! ");
                tabuleiro[x][y].secret = false;
                embarcacoes[tabuleiro[x][y].iEmbarcacao]--;
                certos++;
                destroyer++;
                if (destroyer==2){
                    System.out.println("Afundou um destroyer");
                }
                break;
                
        case 'C':
                System.out.println("Você acertou um Cruzador! ");
                tabuleiro[x][y].secret = false;
                embarcacoes[tabuleiro[x][y].iEmbarcacao]--;
                certos++;
                cruzador++;
                if(cruzador==4){
                    System.out.println("Afundou um Cruzador");
                }
                break;
        case 'P':
                System.out.println("Você acertou um Porta-Avião! ");
                tabuleiro[x][y].secret = false;
                embarcacoes[tabuleiro[x][y].iEmbarcacao]--;
                certos++;
                portaviao++;
                if (portaviao==5){
                    System.out.println("Afundou um porta-avião");
                }
                break;
        }
        //Retorna 0 quando acertar o tiro
        return 0;
    }

    public static void gerarLog(File arquivo) {
      
     PrintWriter arquivo = null;//Erro ñ sei pq! Uma ajuda pf; 
       try{
           FileWriter out = new FileWriter("Log.txt", true);
             arquivo = new PrintWriter(out); 
             while(){
                 // da qui não segue nada;
                  //adiantei só um pouco;
             }
       }catch(Exception e){
           System.out.println(e);
       } 
    }

    public static void imprimirTabuleiro() {
         
        System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.println("--------------------------------------");
        for (int x = 0; x < 10; x++) {
            System.out.print(x);
            for (int y = 0; y < 10; y++) {
                if (tabuleiro[x][y].secret) {
                    System.out.print("\t#");

                } else {
                    System.out.print("\t" + tabuleiro[x][y].casa);

                }
            }
            System.out.println();
        }
    }
}

    
    

