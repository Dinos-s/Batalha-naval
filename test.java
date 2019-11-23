/**
 * test
 */
public class test {
//    static int [] [] tabuleiro = new int [10] [10];
//    static int [] [] posicao = new int [10] [10];


    public static void main(String[] args) {
        int [][] tabuleiro = new int [10] [10];
       

        IniciaPosicao(tabuleiro);
        //Sub();
        //posicaoDosDistroyers();
        //posicaoDosCruzadores();
        //posicaoDosNavios();
        //posicaoDoPortaAviao();

        // inicilizaMatriz(tabuleiro);
        //imprimeTabuleiro();

        //vericaPosicao();
        System.out.println("Ganhou");
    }

    public static void IniciaPosicao(int [][] tabuleiro){
        System.out.println(" \t0 \t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9");
        for(int ilinha=0; ilinha < 10; ilinha++){
            System.out.print("Linha" + ilinha);

            for(int icoluna=0; icoluna < 10; icoluna++){
               System.out.print("\t #");
               tabuleiro[ilinha][icoluna]=0;
            }
            System.out.println();
            System.out.println();
        }
    }
    
    public static void Sub(){
        //1°submarino
        posicao[9][1]=S;
        //2°submarino
        posicao[9][4]=S;
        //3°submarino
        posicao[5][2]=S;
        //4°submarino
        posicao[0][9]=S;
        //5°submarino
        posicao[7][7]=S;
    }
    public static void Destroyer(){
        //1°destroyer
        posicao[2][2]=D;
        posicao[2][3]=D;
        //2°destroyer
        posicao[10][8]=D;
        posicao[10][9]=D;
        //3°destroyer
        posicao[4][6]=D;
        posicao[3][6]=D;
    }
    public static void Cruzador() {
         //1°cruzador
         posicao[4][9]=C;
         posicao[5][9]=C;
         posicao[6][9]=C;
         posicao[7][9]=C;
         //2°cruzador
         posicao[7][2]=C;
         posicao[7][0]=C;
         posicao[7][3]=C;
         posicao[7][4]=C;
    }
    public static void Portaavioes() {
         //1°porta-avioes
         posicao[0][3]=P;
         posicao[0][4]=P;
         posicao[0][5]=P;
         posicao[0][6]=P;
         posicao[0][7]=P;
    }

    // public static void inicilizaMatriz(int[][] tabuleiro){
    //     System.out.println("\t1 \t2 \t3 \t4 \t5");
    //     System.out.println();
        
    //     for(int linha=0 ; linha < 10 ; linha++ ){
    //         System.out.print((linha+1)+"");
    //         for(int coluna=0 ; coluna < 10 ; coluna++ ){
    //             if(tabuleiro[linha][coluna]==0){
    //                 System.out.print("\t"+"#");
    //             }else if(tabuleiro[linha][coluna]==0){
    //                 System.out.print("\t"+"*");
    //             }else if(tabuleiro[linha][coluna]==1){
    //                 System.out.print("\t"+"X");
    //             }
                
    //         }
    //         System.out.println();
    //     }

    // }

}