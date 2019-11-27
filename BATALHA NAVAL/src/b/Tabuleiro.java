
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

/**
 *
 * @author leonardo ramos
 */
public class Tabuleiro {

    char casa; // 0, X, S, D, C, P
    int iEmbarcacao; // índice da embarcação no vetor embarcações
    boolean secret = true;
    Tabuleiro(char casa, int iEmbarcacao){
        this.casa = casa;
        this.iEmbarcacao = iEmbarcacao;
    }

    Tabuleiro() {
    }
}
