package estudos.padraodeprojeto;

public class Testes {
    public static void main(String[] args) {
        System.out.println("TESTANDO INSTANCIA LAZY");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("TESTANDO INSTANCIA EAGER");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("TESTANDO INSTANCIA LAZYHOLDER");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        Comportamento comportamentoNormal = new ComportamentoNormal();
        Comportamento comportamentoDefensivo = new ComportamentoDefensivo();
        Comportamento comportamentoAgressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.setComportamento(comportamentoDefensivo);
        robo.mover();
        robo.setComportamento(comportamentoAgressivo);
        robo.mover();

        Facede facede = Facede.getInstance();
        facede.migrarCliente("Jose Allan Andrade de Santana","11090-100");
    }
}
