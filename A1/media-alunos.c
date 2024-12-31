#include <stdio.h>

float obterMedia(float n1, float n2, float n3) {
    return (n1 + n2 + n3)/3;
}

float obterMediaGeral(float mediaAlunos[], int totalAlunos) {
    float mediaGeral = 0;
    int i;
    
    for (i = 0; i < totalAlunos; i++)
        mediaGeral += mediaAlunos[i];
    
    return mediaGeral/totalAlunos;
}

int main() {
    float mediaAlunos[5], n1, n2, n3;  
    int i;
    
    for (i = 0; i < 5; i++) {
        printf("Digite as tres notas do aluno %d: ", i);
        scanf("%f %f %f", &n1, &n2, &n3);
        mediaAlunos[i] = obterMedia(n1, n2, n3);
        printf("A media do aluno %d e %f\n", i, mediaAlunos[i]);
    }
    
    printf("A media total da turma e: %f\n", obterMediaGeral(mediaAlunos, 5));		

    return 0;
}
