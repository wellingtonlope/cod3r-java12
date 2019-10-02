package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.ano = 2021;

        var d2 = new Data(1, 4, 1997);

        System.out.println(d1.obterDataFormatada());
        d2.imprimirDataFormatada();
    }
}
