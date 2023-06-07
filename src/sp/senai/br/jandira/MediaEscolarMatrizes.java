package sp.senai.br.jandira;

import java.util.Scanner;

public class MediaEscolarMatrizes {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String resposta = "";
		int numeroAlunos = 0;

		System.out.println("------------------------------------------------------------");
		System.out.println("                         NOTAS FINAIS");
		System.out.println("------------------------------------------------------------");
		System.out.println();

		System.out.println("Quantos alunos existem na turma?");
		numeroAlunos = teclado.nextInt();
				
		String alunos[][] = new String [numeroAlunos][2];
		double notas[][] = new double [numeroAlunos][5];

		if (numeroAlunos <= 35) {

			for (int linha = 0; linha < notas.length; linha++) {
				
				teclado.nextLine();
				System.out.println("");
				
				System.out.print("Nome do aluno: ");
				alunos[linha][0] = teclado.nextLine();
								
				for(int coluna = 0; coluna < notas[linha].length - 1; coluna++) {
				
					System.out.print("Nota do " + (coluna + 1) + "º bimestre: ");
					notas[linha][coluna] = teclado.nextDouble();
																									
				}
				
				notas[linha][4] = (notas[linha][0] + notas[linha][1] + notas[linha][2] + notas[linha][3]) / 4;
				
				if(notas[linha][4] >= 5){
					alunos[linha][1] = "APROVADO";
				}else {
					alunos[linha][1] = "REPROVADO";
				}
				
				if(linha != numeroAlunos - 1) {
					System.out.println();
					System.out.println("Deseja adicionar outro aluno? (S/N)");
					resposta = teclado.next();
				}
				
				if(resposta.equalsIgnoreCase("n")) {
					break;					
				}
				
								
			}
			
			System.out.println();
			
			System.out.println("------------------------------------------------------------");
			System.out.println("                     LISTA GERAL DA TURMA");
			System.out.println("------------------------------------------------------------");
			System.out.printf("%-10s %-7s %-7s %-7s %-7s %-7s %-12s %n", "Nome", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Média", "Situação");
			System.out.println("------------------------------------------------------------");
			
			for(int i = 0; i < notas.length; i++) {
				
				if(alunos[i][0] == null){
					break;
				}
				
				System.out.printf("%-10s %-7s %-7s %-7s %-7s %-7s %-12s %n", alunos[i][0], notas[i][0], notas[i][1], notas[i][2], notas[i][3], notas[i][4], alunos[i][1]);
			
			}
			
			System.out.println("------------------------------------------------------------");

		} else {
			System.out.println("Uma turma só pode ter 35 alunos, reinicie o sistema");
		}
		
		

	}

}
