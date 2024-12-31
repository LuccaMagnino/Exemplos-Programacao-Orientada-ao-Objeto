package Votacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ContaCargos extends Thread {

	String arquivo;
	String cargo;
	ArrayList<Candidato> candidatos = new ArrayList<Candidato>();

	ContaCargos(String arq, String cargo) {
		arquivo = arq;
		this.cargo = cargo;
	}

	public void run() {

		String info[] = new String[4];
		try {
			FileReader r = new FileReader(arquivo);
			BufferedReader bf = new BufferedReader(r);

			String linha;

			while ((linha = bf.readLine()) != null) {

				if (!linha.equals("")) {
					info = linha.split(";");

					if (info[0].equals(cargo)) {

						int i = 0;

						while (i < candidatos.size()) {
							if (candidatos.get(i).achouCandidato(info[1])) {
								candidatos.get(i).soma();
								break;
							}
							i++;
						}

						// Se chegou ao final e n�o encontrou o 								candidato na lista
						if (i == candidatos.size()) {
							if (!info[1].equals("Branco") && !info[1].equals("Anulado")) {
								candidatos.add(new Candidato(info[1], Integer.parseInt(info[2]), info[3]));
							} else
								candidatos.add(new Candidato(info[1], Integer.parseInt(info[2]), " "));
						}
					}
				}
			} // fim while de leitura de linha

			r.close();
		} catch (IOException e) {
			System.out.println("fim");
		}

		int maior = 0;
		Candidato vencedor = null;

		for (int i = 0; i < candidatos.size(); i++) {
			if (candidatos.get(i).qtde > maior) {
				vencedor = candidatos.get(i);
				maior = candidatos.get(i).qtde;
			}
		}

		/* Mostra o vencedor */
		System.out.println("Vencedor " + cargo + " : " + vencedor.numero
				+ " - " + vencedor.nome + " - " + vencedor.partido + " - " + vencedor.qtde);
	}

	public static void main(String[] args) {
		// Caminho relativo para o arquivo .txt dentro do diret�rio do projeto
        String caminhoRelativo = "\\src\\votacao\\votos.txt";

        // Obtendo o diret�rio de trabalho atual
        String diretorioDeTrabalho = System.getProperty("user.dir");

        // Criando um objeto File com o caminho relativo
        String path_arq = diretorioDeTrabalho + caminhoRelativo;

        //imprimindo o caminho
        System.out.println("\n");
        System.out.println(path_arq);
        System.out.println("\n");
        
        ContaCargos c1 = new ContaCargos(path_arq, "Presidente");
		ContaCargos c2 = new ContaCargos(path_arq, "Governador");
		ContaCargos c3 = new ContaCargos(path_arq, "Deputado Federal");
		ContaCargos c4 = new ContaCargos(path_arq, "Deputado Estadual");
		ContaCargos c5 = new ContaCargos(path_arq, "Senador");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
	}
}
