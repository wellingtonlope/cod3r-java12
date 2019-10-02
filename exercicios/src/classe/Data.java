package classe;

public class Data {
    Integer dia;
    Integer mes;
    Integer ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {
        String diaS = dia < 10 ? '0' + dia.toString() : dia.toString();
        String mesS = mes < 10 ? '0' + mes.toString() : mes.toString();
        String anoS = ano.toString();
        return String.format("%s/%s/%s", diaS, mesS, anoS);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
