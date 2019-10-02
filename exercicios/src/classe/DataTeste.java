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

        System.out.println(d1.obterDataFormatada());
        d2.imprimirDataFormatada();
    }
}
