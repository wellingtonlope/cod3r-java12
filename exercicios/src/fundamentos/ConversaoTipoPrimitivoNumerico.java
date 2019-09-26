package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.12345678; // explícita (CAS)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // explícita (CAS)
        System.out.println(d);

        double e = 1.99;
        int f = (int) e; // explícita (CAS)
        System.out.println(f);
    }
}
