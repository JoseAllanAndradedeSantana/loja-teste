package estudos.padraodeprojeto;

public class SingletonEager {
    private static SingletonEager instace = new SingletonEager();

    private SingletonEager(){
    }

    public static SingletonEager getInstance(){
        return instace;
    }
}
