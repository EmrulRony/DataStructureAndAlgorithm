package Other;

class MyCustomGeneric<T>{
    private T obj;

    public void setObj(T obj){
        this.obj = obj;
    }

    public Object getObj(){
        return this.obj;
    }

    public <E> void getObjectType(E elemet){
        System.out.println("This object is type "+ elemet.getClass().getName());
    }
}

public class GenericDemo{
    public static void main(String[] args) {
        MyCustomGeneric<Integer> obj = new MyCustomGeneric();
        obj.setObj(100);
        System.out.println(obj.getObj());

        obj.getObjectType(100);

    }
}