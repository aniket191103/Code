/**
 * InstanceVarVsClassVAriableVsLocalVar
 */
class T{
    int y ; // instance variable   binds with object 

    static int z ; // class variable    z is bind with class  ,, static things bind with class
}

public class InstanceVarVsClassVAriableVsLocalVar {

    public static void main(String[] args) {
        T obj = new T();
        T obj2 = new T();

        System.out.println(obj.y); // y is bind with object;



    }
}