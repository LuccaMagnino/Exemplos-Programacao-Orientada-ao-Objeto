import java.util.Scanner; //Me recomendaram usar essa biblioteca para substituir o scanf com Scanner

public class MediaAlunos {
    public static float obterMedia (float n1, float n2, float n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static float obterMediaGeral(float[] MediaAlunos, int TotalAlunos) {
        float MediaGeral = 0;
        int i = 0;

        for (i = 0; i < TotalAlunos; i++) {
            MediaGeral += MediaAlunos[i];
        }
        return MediaGeral/TotalAlunos;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] MediaAlunos = new float[5];
        int i;

        for(i = 0; i < 5; i++) {
            System.out.print("Digite as tres notas do aluno " + (i) + ": ");
            float n1 = scanner.nextFloat();
            float n2 = scanner.nextFloat();
            float n3 = scanner.nextFloat();

            MediaAlunos[i] = obterMedia(n1, n2, n3);
            System.out.println("A media do aluno " + (i) + " e " + MediaAlunos[i]);
        }

        System.out.println("A media total da turma e: " + obterMediaGeral(MediaAlunos, 5));

        scanner.close();
    }
}


