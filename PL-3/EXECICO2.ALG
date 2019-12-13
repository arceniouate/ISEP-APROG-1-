Algoritmo "execico2"

Var
nAlunos,contadorN,c,numNegativo,numPositivo :inteiro
   somaN,somaP,nota,notaN,mediaN,mediaP,percP,percN:real
     //pot estudar a questão da de numero de aluno no calculo dos nº Alunos na media
     // To do validar a nota para ter limites
     //ver cenas da percentagem dos numeros negativos
Inicio
  somaN<-0
  contadorN<-0
  numPositivo<-0
  numNegativo<-0
 // mediaN<-0

      escreval("Insira o numero total de alunos")
      leia(nAlunos)
      
   enquanto (0>=nAlunos) faca
      escreval("numero invalido!o num tem ser maior que 0")
      escreval("Insira o numero de alunos")
      leia(nAlunos)
   fimenquanto
   
  para c<-1 ate nAlunos passo 1 faca
       escreval("Insira as nota")
      leia(nota)
      enquanto ((0<nota) e (nota>20)) faca
         escreval("nota invalida")
         leia(nota)
       fimenquanto
         se(10<nota)entao
           somaN<-somaN+nota
             numNegativo<-numNegativo+1
         fimse
            se(nota>=10)entao
           somaP<-somaP+nota
            numPositivo<-numPositivo+1
         fimse
   fimpara
    mediaN<- somaN/nAlunos
    mediaP<-somaP/nAlunos
    percP<-numPositivo/nAlunos
    percN<-numNegativo/nAlunos
    
    Escreval("Media das notas Negativa : ",mediaN)
    Escreval("Media das notas Positivas : ",mediaP)
    Escreval("====================================")
    Escreval("Percetagem dos numeros Negativo : ",percN,"%")
    Escreval("Percentagem dos numeros Positivos : ",percP,"%")

Fimalgoritmo