package singleton;

public class SingletonHolder {
    private static class InstanciaHolder {
        private static final SingletonHolder instancia = new SingletonHolder();
    }

    private SingletonHolder() {}

    public static SingletonHolder getInstancia() {
        return InstanciaHolder.instancia;
    }
}
