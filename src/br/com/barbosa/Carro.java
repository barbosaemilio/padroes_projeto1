package br.com.barbosa;

public class Carro {
    private Motor motor;
    private Pneu pneu;
    private Freio freio;

    public Carro(CarFactory factory) {
        this.motor = factory.criarMotor();
        this.pneu = factory.criarPneu();
        this.freio = factory.criarFreio();
    }

    public void mostrarCarro(){
        motor.tipoMotor();
        pneu.tipoPneu();
        freio.tipoFreio();
    }
}
