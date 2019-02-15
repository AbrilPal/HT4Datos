public class SingleTon {
    private String nombre;
    private static SingleTon singleton;

    private SingleTon(String nombre){
        this.nombre = nombre;
    }

    private static SingleTon getSingleton(String nombre){
        if(singleton == null ){
            singleton = new SingleTon(nombre);
        }else{

        }
        return singleton;
    }
}
