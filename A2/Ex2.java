class Contato {

    private String nome;
    private String email;
    private String telefone;


    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public void imprimeContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }
}



class Agenda {
    private Contato[] contatos;
    private int tamanho;

    public Agenda(int capacidade) {
        contatos = new Contato[capacidade];
        tamanho = 0;
    }

    public void armazenarContato(Contato contato) {
        if (tamanho < contatos.length) {
            contatos[tamanho] = contato;
            tamanho++;
        } else {
            System.out.println("Agenda cheia!");
        }
    }

    public void removeContato(Contato contato) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].equals(contato)) {
                for (int j = i; j < tamanho - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }
                contatos[tamanho - 1] = null;
                tamanho--;
                System.out.println("Contato removido com sucesso!");
                return;
            }
        }
        System.out.println("Contato não encontrado!");
    }

    public int buscaContato(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimeAgenda() {
        if (tamanho == 0) {
            System.out.println("Agenda vazia!");
            return;
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Contato " + (i + 1) + ":");
            contatos[i].imprimirContato();  
        }
    }

    public void imprimeContato(int index) {
        if (index >= 0 && index < tamanho) {
            System.out.println("Contato " + (index + 1) + ":");
            contatos[index].imprimirContato();  
        } else {
            System.out.println("Índice inválido!");
        }
    }
}





public class Ex2 {
    public static void main(String[] args) {

        Agenda agenda = new Agenda(3);
        

        Contato contato1 = new Contato("João Silva", "joao@email.com", "1234-5678");
        Contato contato2 = new Contato("Maria Santos", "maria@email.com", "9876-5432");
        Contato contato3 = new Contato("Carlos Oliveira", "carlos@email.com", "1357-2468");


        agenda.armazenarContato(contato1);
        agenda.armazenarContato(contato2);
        agenda.armazenarContato(contato3);


        System.out.println("Todos os contatos da agenda:");
        agenda.imprimeAgenda();


        int indice = agenda.buscaContato("Maria Santos");
        if (indice != -1) {
            System.out.println("\nContato encontrado na posição: " + indice);
            agenda.imprimeContato(indice);
        } else {
            System.out.println("\nContato não encontrado.");
        }


        agenda.removeContato(contato2);


        System.out.println("\nAgenda após remoção:");
        agenda.imprimeAgenda();
    }
}


