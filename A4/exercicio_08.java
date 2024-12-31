public class exercicio_08 {
    package LabClasseInterface;

public class Aluno implements Estudante {
    private String nome;
    private int nMatricula;

    public Aluno(String nome, int nMatricula) {
        this.nome = nome;
        this.nMatricula = nMatricula;
    }

    @Override
    public void estudar() {
        System.out.println(nome + " está estudando!");
    }

    public void fazerProva(Prova prova) {

        String[] respostas = {"R1", "R2", "R3", "R4", "R5"}; 
        prova.setRespostas(respostas);
        System.out.println(nome + " fez a prova e as respostas foram registradas.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }
}

}
