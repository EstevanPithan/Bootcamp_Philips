//Bootcamp Phillips
programa
{
	
	funcao inicio()
	{
		inteiro nota1 =-1, nota2=-1, nota3=-1, nota4=-1, media=-1
		inteiro aux_menu = 0
		inteiro sair_menu = 0
		cadeia aluno = "vazio"
		

		faca {
			escreva("\nEscolha uma opção: \n\t1-Cadastrar Aluno\n\t2-Consultar Notas\n\t3-Ver Resultados\n\t4-Sair do programa\n\tOpção Escolhida: ")
			leia(aux_menu)
			escolha(aux_menu){
				caso 1:
					escreva("Digite o nome do aluno: ")
					leia(aluno)
					escreva("Digite a nota 1: ")
					leia(nota1)
					escreva("Digite a nota 2: ")
					leia(nota2)
					escreva("Digite a nota 3: ")
					leia(nota3)
					escreva("Digite a nota 4: ")
					leia(nota4)
					escreva("\n")
				pare				
				caso 2:
					escreva("\nNota 1 é: " + nota1)
					escreva("\nNota 2 é: " + nota2)
					escreva("\nNota 3 é: " + nota3)
					escreva("\nNota 4 é: " + nota4)
					escreva("\n")
				pare
				caso 3:
					media = (nota1 + nota2 + nota3 + nota4)/4
					escreva("\nO aluno " +aluno + " teve media de " +media)
					//Verifica se a média do aluno é maior do que 7
					se(media>=7){
						escreva("\nParabéns!!! Você foi aprovado")
					}
					senao{
						escreva("\nEitaa!! Não foi dessa vez.")
					}
					escreva("\n")
				pare
				caso 4:
					escreva("\nTchau e até mais")
					sair_menu = 1
					escreva("\n")
				pare
				caso contrario:
					escreva("\nVocê deve escolher numeros de 1 a 4,")
					escreva("\n")
			}
		}enquanto(sair_menu == 0)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */