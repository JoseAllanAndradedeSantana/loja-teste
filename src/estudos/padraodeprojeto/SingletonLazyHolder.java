package estudos.padraodeprojeto;

public class SingletonLazyHolder {

    private SingletonLazyHolder(){
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
    private static class InstanceHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

}
