package excecao.personalizadaA;

import excecao.Aluno;

public class ValidacoesTeste {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Ana", 7);
            Validar.aluno(aluno);

            Validar.aluno(null);
        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }
}
