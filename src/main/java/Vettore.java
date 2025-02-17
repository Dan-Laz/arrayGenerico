public class Vettore<T> {
    private T[] vettore;

    public Vettore(int x){
        vettore = (T[]) new Object[x];
    }

    public Vettore(){
        vettore = (T[]) new Object[100];
    }

    public T getItem(int index){
        return vettore[index];
    }

    public boolean setItem(int index, T item){
        if (index >= vettore.length){
            return false;
        }else{
            vettore[index] = item;
            return true;
        }
    }
}
