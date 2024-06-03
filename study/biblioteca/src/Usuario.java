public class Usuario {
    private String nome;
    private String email;
    private String numeroTel;

    public Usuario(String nome, String email, String numeroTel) {
        this.nome = nome;
        this.email = email;
        this.numeroTel = numeroTel;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + numeroTel);
    }

    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }

    public String getNumeroTel() {
        return numeroTel;
    }


}
