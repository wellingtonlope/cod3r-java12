package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        // if(bool) ...
        // while(bool) ...
        // for(;bool;) ...

        String faixa = "laranja";
        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelhra":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Nai sei nada");
        }

        System.out.println("Fim!");

    }
}
