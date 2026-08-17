package br.com.barbosa;

public class FiatFactory implements CarFactory {
    @Override
    public Motor criarMotor() {
        return new MotorFiat();
    }
    @Override
    public Pneu criarPneu() {
        return new PneuFiat();
    }
    @Override
    public Freio criarFreio() {
        return new FreioSimples();
    }
}
