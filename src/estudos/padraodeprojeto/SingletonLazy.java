package estudos.padraodeprojeto;
/**
 * @author JoseAllan
 * padrao singleton estudos
 *
 * */
public class SingletonLazy {
    private static SingletonLazy instace;

    private SingletonLazy(){
    }

    public static SingletonLazy getInstance(){
        if(instace == null){
            instace = new SingletonLazy();
        }
        return instace;
    }
}
