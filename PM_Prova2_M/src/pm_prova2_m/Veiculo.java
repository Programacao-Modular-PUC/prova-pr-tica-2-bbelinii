/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author glbra
 */
public abstract class Veiculo {

    protected String placa;
    protected String modelo;
    protected int anoFabricacao;
    protected double valorDiaria;
    protected double quilometragem;
    protected StatusVeiculo statusVeiculo;

    public Veiculo(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo statusVeiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valorDiaria = valorDiaria;
        this.quilometragem = quilometragem;
        this.statusVeiculo = statusVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public StatusVeiculo getStatusVeiculo() {
        return statusVeiculo;
    }

    public void setStatusVeiculo(StatusVeiculo statusVeiculo) {
        this.statusVeiculo = statusVeiculo;
    }

    public abstract void exibirDados();
}