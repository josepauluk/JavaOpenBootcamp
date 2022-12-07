public class Coche {
    int numeroP;

    public static void main(String[] args) {

        Coche coche1 = new Coche();

        coche1.numeroP = 0;
        coche1.numeroP = agregarP(coche1.numeroP);

        System.out.println("La cantidad de puerta es: " + coche1.numeroP);
    }


    public static int agregarP(int a) {
        a ++;
        return a;
    }

}
