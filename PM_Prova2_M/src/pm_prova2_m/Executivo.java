/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1061288
 */
public class Executivo extends Aluguel implements Avaliavel {

    private boolean quilometragemIlimitada;
    private boolean motoristaParticular;
    private int nota;

    public Executivo(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {

        super(nomeCliente, quantidadeDias, valorTotal, status);

        this.quilometragemIlimitada = true;
        this.motoristaParticular = true;
    }

    @Override
    public void avaliar(int nota) {
        this.nota = nota;
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("ALUGUEL EXECUTIVO");
        System.out.println("Cliente: " + getNomeCliente());
        System.out.println("Dias: " + getQuantidadeDias());
        System.out.println("Valor Total: " + getValorTotal());
        System.out.println("Status: " + getStatus());
        System.out.println("KM Ilimitado: " + quilometragemIlimitada);
        System.out.println("Motorista Particular: " + motoristaParticular);
        System.out.println("Nota: " + nota);
        System.out.println("Seguro Incluso: " + possuiSeguroIncluso());
        System.out.println();
    }

    @Override
    public boolean possuiSeguroIncluso() {
        return true;
    }
}