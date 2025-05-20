import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonHolder;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        SingletonHolder holder = SingletonHolder.getInstancia();
        System.out.println(holder);

        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("João", "12345678");
    }
}
