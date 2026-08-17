package br.com.barbosa;

public class ChevroletFactory implements CarFactory {
    @Override
    public Motor criarMotor() {
        return new MotorChevrolet();
    }
    @Override
    public Pneu criarPneu() {
        return new PneuChevrolet();
    }
    @Override
    public Freio criarFreio() {
        return new FreioABS();
    }
}
