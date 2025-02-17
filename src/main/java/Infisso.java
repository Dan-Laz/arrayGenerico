public class Infisso {
    private String materiale;
    private float altezza;
    private float larghezza;

    public Infisso(){
        setAltezza(0);
        setLarghezza(0);
        setMateriale("incognito");
    }
    public Infisso(String materiale, float altezza, float larghezza){
        setMateriale(materiale);
        setAltezza(altezza);
        setLarghezza(larghezza);
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }
    public void setLarghezza(float larghezza) {
        this.larghezza = larghezza;
    }
    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    public float getAltezza() {
        return altezza;
    }
    public float getLarghezza() {
        return larghezza;
    }
    public String getMateriale() {
        return materiale;
    }

    public String toString(){
        return "infisso - materiale : "+materiale+", altezza : "+altezza+", larghezza : "+larghezza;
    }
}
