class Contato {
    private String nome;
    private String email;
    private String telefone;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Lucca Magnino");
        contato.setEmail("luccamagnino@hotmail.com");
        contato.setTelefone("+55(62)993277500");
        contato.imprimirDados();
    }
}