package br.com.bytebank.banco.modelo;

import java.awt.font.TextHitInfo;

public class GuardadorDecontas {

    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDecontas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuandtidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}
