public class Vettore<T> {
    private T[] vettore;
    private int contatore;

    public Vettore(int x){
        vettore = (T[]) new Object[x];
        contatore = 0;
    }

    public Vettore(){
        vettore = (T[]) new Object[100];
        contatore = 0;
    }

    public T getItem(int index){
        return vettore[index];
    }

    public boolean setItem(int index, T item){
        if (index >= vettore.length){
            return false;
        }else{
            vettore[index] = item;
            contatore ++;
            return true;
        }
    }
    public boolean addItem(T item){
        if (contatore == vettore.length){
            return false;
        }else{
            vettore[contatore] = item;
            contatore++;
            return true;
        }
    }
}
