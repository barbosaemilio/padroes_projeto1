package br.com.barbosa;

public interface CarFactory {
    Motor criarMotor();
    Pneu criarPneu();
    Freio criarFreio();
}
