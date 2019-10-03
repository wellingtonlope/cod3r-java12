package classe;

public class Data {
    Integer dia;
    Integer mes;
    Integer ano;

    Data() {
        this(1,1,1970);
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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
