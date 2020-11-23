package ua.edu.ucu.collections.immutable;

public class ImmutableArrayList implements ImmutableList{
    private Object[] array;

    public ImmutableArrayList(){
        this.array = new Object[0];
    }

    public ImmutableArrayList(Object[] obj){
        this.array = obj;
    }

    @Override
    public ImmutableList add(Object e) {
        int sizeArray = this.array.length;
        Object[] newArray = new Object[sizeArray + 1];
        for (int i=0; i < array.length; i ++){
            newArray[i] = array[i];
        }
        newArray[sizeArray] = e;
        return new ImmutableArrayList(newArray);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        if (index < 0 || index > array.length){
            throw new IllegalArgumentException("Wrong index");
        }
        int sizeArray = this.array.length;
        Object[] newArray = new Object[sizeArray + 1];
        for (int i=0; i < index; i ++){
            newArray[i] = array[i];
        }
        newArray[index] = e;
        for (int j=index + 1; j < sizeArray; j ++){
            newArray[j] = array[index];
            index ++;
        }
        return new ImmutableArrayList(newArray);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        int sizeArray = this.array.length;
        Object[] newArray = new Object[c.length + sizeArray];
        for (int i=0; i < sizeArray; i ++){
            newArray[i] = array[i];
        }
        for (int j=0; j < c.length; j ++){
            newArray[sizeArray + j] = c[j];
        }
        return new ImmutableArrayList(newArray);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        if (index < 0 || index > array.length){
            throw new IllegalArgumentException("Wrong index");
        }
        int sizeArray = this.array.length;
        Object[] newArray = new Object[c.length + sizeArray];

        for (int i=0; i < index; i ++){
            newArray[i] = array[i];
        }
        for (int j=0; j < c.length; j ++){
            newArray[index + j] = c[j];
        }
        for (int r=index + c.length; r < sizeArray + c.length; r++){
            newArray[r] = array[index];
            index++;
        }
        return null;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index > array.length){
            throw new IllegalArgumentException("Wrong index");
        }

        return array[index];
    }

    @Override
    public ImmutableList remove(int index) {
        if (index < 0 || index > array.length){
            throw new IllegalArgumentException("Wrong index");
        }
        int sizeArray = this.array.length;
        Object[] newArray = new Object[sizeArray - 1];
        for (int i=0; i < index; i ++){
            newArray[i] = array[i];
        }
        for (int j=index + 1; j < sizeArray; j ++){
            newArray[j] = array[j];
        }
        return new ImmutableArrayList(newArray);

    }

    @Override
    public ImmutableList set(int index, Object e) {
        if (index < 0 || index > array.length){
            throw new IllegalArgumentException("Wrong index");
        }
        int sizeArray = this.array.length;
        Object[] newArray = new Object[sizeArray];
        for (int i=0; i < sizeArray; i ++){
            newArray[i] = array[i];
        }
        newArray[index] = e;
        return new ImmutableArrayList(newArray);

    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < array.length; i ++){
            if (array[i] == e){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public ImmutableList clear() {
        int newSize = 0;
        Object[] newArray = new Object[newSize];
        return new ImmutableArrayList(newArray);
    }

    @Override
    public boolean isEmpty() {
        if(array.length == 0){
            return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return array;
    }
}
