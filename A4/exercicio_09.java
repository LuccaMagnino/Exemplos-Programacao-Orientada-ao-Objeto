public class exercicio_09 {
    package LabClasseInterface;

public class Prova {
    private String[] questoes;
    private String[] respostas;
    private double nota;

    public Prova(String[] questoes) {
        this.questoes = questoes;
        this.respostas = new String[questoes.length];
        this.nota = 0; 
    }

    public String[] getQuestoes() {
        return questoes;
    }

    public void setQuestoes(String[] questoes) {
        this.questoes = questoes;
    }

    public String[] getRespostas() {
        return respostas;
    }

    public void setRespostas(String[] respostas) {
        this.respostas = respostas;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

}
