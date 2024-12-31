public class exercicio_10 {
    package LabClasseInterface;

public class TestaSolucao {
    public static void main(String[] args) {
        Professor maria = new ProfessorUniversitario("Maria", 2, 3000);
        Professor jose = new ProfessorDaEducacaoBasica("Jose", 3, 2000);
        Aluno primeiroNomeDoEstudante = new Aluno("PrimeiroNomedoEstudante", 12345);
        Estudante[] pessoasQueEstudam = new Estudante[3];
        pessoasQueEstudam[0] = maria;
        pessoasQueEstudam[1] = jose;
        pessoasQueEstudam[2] = primeiroNomeDoEstudante;

        for (Estudante estudante : pessoasQueEstudam)
            estudante.estudar();

        Prova[] provasDaFaculdade = maria.elaborarProvas();

        primeiroNomeDoEstudante.fazerProva(provasDaFaculdade[0]);
        maria.corrigirProva(provasDaFaculdade[0]);

        System.out.println("PrimeiroNomedoEstudante tirou " + provasDaFaculdade[0].getNota() + " na prova");
    }
}

}
