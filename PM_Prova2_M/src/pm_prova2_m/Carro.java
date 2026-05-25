/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1061288
 */
public class Carro extends Veiculo implements Avaliavel {

    private int quantidadePortas;
    private int nota;

    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria,
                 double quilometragem, StatusVeiculo statusVeiculo, int quantidadePortas) {

        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, statusVeiculo);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void avaliar(int nota) {
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.println("carro");
        System.out.println("placa: " + placa);
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + anoFabricacao);
        System.out.println("diaria: " + valorDiaria);
        System.out.println("km: " + quilometragem);
        System.out.println("Status: " + statusVeiculo);
        System.out.println("Portas: " + quantidadePortas);
        System.out.println("Nota: " + nota);
        System.out.println();
    }
}
