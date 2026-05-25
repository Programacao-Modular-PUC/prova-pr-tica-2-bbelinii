/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1061288
 */


public class Basico extends Aluguel {

    private int limiteKm;

    public Basico(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {

        super(nomeCliente, quantidadeDias, valorTotal, status);

        this.limiteKm = 100;
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("ALUGUEL BASICO");
        System.out.println("Cliente: " + getNomeCliente());
        System.out.println("Dias: " + getQuantidadeDias());
        System.out.println("Valor Total: " + getValorTotal());
        System.out.println("Status: " + getStatus());
        System.out.println("Limite KM: " + limiteKm);
        System.out.println("Seguro Incluso: " + possuiSeguroIncluso());
        System.out.println();
    }

    @Override
    public boolean possuiSeguroIncluso() {
        return false;
    }
}