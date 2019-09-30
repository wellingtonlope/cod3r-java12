package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        var trabalho1 = true;
        var trabalho2 = true;

        var comprouTV50 = trabalho1 && trabalho2;
        var comprouTV32 = trabalho1 ^ trabalho2;
        var comprouSorvete = trabalho1 || trabalho2;
        var maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTV50);
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);
    }
}
