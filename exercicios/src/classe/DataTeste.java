package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 1;
        d1.mes = 4;
        d1.ano = 1997;

        var d2 = new Data();
        d2.dia = 2;
        d2.mes = 10;
        d2.ano = 2019;

        System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
        System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);
    }
}
