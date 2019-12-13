 //A funcionalidade do algoritmo e classificar as turmas consoante o nivel de alunos aprovados
Algoritmo "exercicio1"

Var
nota1, nota2, nota3,peso1,peso2,peso3: inteiro
mediaPesada :real
Inicio
	Escreval("Insira a nota1")//mostra msg na tela
	leia(nota1)//leitura do numero
	Escreval("Insira a nota2")
	leia(nota2)
	Escreval("Insira a nota3")
	leia(nota3)
	Escreval("Insira o peso1")
	leia(peso1)
	Escreval("Insira o peso2")
	leia(peso2)
	Escreval("Insira o peso2")
	leia(peso3)
	mediaPesada<- ((nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3))entao  //calculo da mediaPesada
		escreval("A media pesada é ",mediaPesada)
 	se(mediaPesada>8)entao
    	escreval("O aluno cumpre com a nota minima exigida",mediaPesada)
  	fimse
Fimalgoritmo