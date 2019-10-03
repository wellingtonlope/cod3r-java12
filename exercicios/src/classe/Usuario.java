package classe;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = this.nome.equals(outro.nome);
            boolean emailIgual = this.email.equals(outro.email);

            return nomeIgual && emailIgual;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.nome.length();
    }
}
