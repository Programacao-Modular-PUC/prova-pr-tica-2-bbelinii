/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1061288
 */
public class Van extends Veiculo implements Avaliavel, Inspecionavel {

    private int maxPassageiros;
    private int nota;

    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo statusVeiculo, int maxPassageiros) {

        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, statusVeiculo);
        this.maxPassageiros = maxPassageiros;
    }

    @Override
    public void avaliar(int nota) {
        this.nota = nota;
    }

    @Override
    public void realizarInspecao() {
        System.out.println("Inspecao realizada na van " + modelo);
    }

    @Override
    public void exibirDados() {
        System.out.println("Van");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Diaria: " + valorDiaria);
        System.out.println("KM: " + quilometragem);
        System.out.println("Status: " + statusVeiculo);
        System.out.println("Maximo passageiros: " + maxPassageiros);
        System.out.println("Nota: " + nota);
        System.out.println();
    }
}