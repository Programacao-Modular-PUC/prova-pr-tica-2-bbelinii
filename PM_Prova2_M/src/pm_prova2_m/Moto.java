/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1061288
 */
public class Moto extends Veiculo implements Inspecionavel {

    private int cilindrada;

    public Moto(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo statusVeiculo, int cilindrada) {

        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, statusVeiculo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void realizarInspecao() {
        System.out.println("Inspecao realizada na moto " + modelo);
    }

    @Override
    public void exibirDados() {
        System.out.println("Moto");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Diaria: " + valorDiaria);
        System.out.println("KM: " + quilometragem);
        System.out.println("Status: " + statusVeiculo);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println();
    }
}