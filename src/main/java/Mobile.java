public class Mobile {
    private float peso;
    private float prezzo;

    public Mobile(){
        setPeso(0);
        setPrezzo(0);
    }
    public Mobile(float peso, float prezzo){
        setPeso(peso);
        setPrezzo(prezzo);
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public float getPeso() {
        return peso;
    }
    public float getPrezzo() {
        return prezzo;
    }

    public String toString(){
        return "mobile - peso : "+peso+", prezzo : "+prezzo;
    }

    public boolean equals(Object o){
        if (o instanceof Mobile){
            Mobile m = (Mobile) o;
            return this.prezzo == m.getPrezzo();
        }else{
            return false;
        }
    }
}
