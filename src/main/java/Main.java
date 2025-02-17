public class Main {
    public static void main(String[] args){
        Vettore<Infisso> infissi = new Vettore<Infisso>(10);
        Vettore<Mobile> mobili = new Vettore<Mobile>(10);

        Infisso i = new Infisso("cemento armato",12,16);
        infissi.setItem(0,i);
        System.out.println(infissi.getItem(0));

        Mobile b = new Mobile(1200,9500);
        mobili.addItem(b);
        System.out.println(mobili.getItem(0));

        System.out.println(mobili.searchItem(b));
        System.out.println(mobili.searchItem(new Mobile(1000,5000)));
    }
}
