package classe;

public class Data {
    Integer dia;
    Integer mes;
    Integer ano;

    String obterDataFormatada() {
        String diaS = dia < 10 ? '0' + dia.toString() : dia.toString();
        String mesS = mes < 10 ? '0' + mes.toString() : mes.toString();
        String anoS = ano.toString();
        return String.format("%s/%s/%s", diaS, mesS, anoS);
    }
}
