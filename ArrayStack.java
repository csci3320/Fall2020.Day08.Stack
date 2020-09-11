
public class ArrayStack<T> {

    private Object[] array;

    public ArrayStack(){
        array = new Object[0];
    }

    public void push(T value){
        Object[] newArray = new Object[array.length+1];
        for(int i  = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        newArray[array.length] = value;
        array = newArray;

    }

    public T pop(){
        if(size() == 0) throw new RuntimeException("You can't pop an empty stack");
        Object[] newArray = new Object[array.length-1];
        for(int i = 0; i < array.length-1; i++){
            newArray[i] = array[i];
        }
        T toReturn = (T)array[array.length-1];
        array=newArray;
        return toReturn;


    }

    public int size(){
        return array.length;
    }

}
