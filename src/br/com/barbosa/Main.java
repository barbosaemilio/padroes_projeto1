package br.com.barbosa;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** FIAT ARGO *****");
        CarFactory fiatFactory = new FiatFactory();
        Carro argo = new FiatArgo(fiatFactory);
        argo.mostrarCarro();

        System.out.println("***** FIAT MOBI *****");
        Carro mobi = new FiatMobi(fiatFactory);
        mobi.mostrarCarro();

        System.out.println("***** CHEVROLET ONIX *****");
        CarFactory chevroletFactory = new ChevroletFactory();
        Carro onix = new ChevroletOnix(chevroletFactory);
        onix.mostrarCarro();

        System.out.println("***** CHEVROLET TRACKER *****");
        Carro tracker = new ChevroletTracker(chevroletFactory);
        tracker.mostrarCarro();


    }
}
