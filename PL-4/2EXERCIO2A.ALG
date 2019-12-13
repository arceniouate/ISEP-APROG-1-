Algoritmo "exercio2b"
var
N,num,c,alg,produto: inteiro
//To Do separa o out put do 1 produto co a do segundo produto
inicio
  produto<-1
   escreval("insira a quantidade de numeros ")
   leia(N)
   enquanto (0>=N) faca
       escreval("numero invalido! o numero deve ser positivo")
       leia(N)
   fimenquanto
   para c<-1 ate N passo 1 faca
      escreval("Insira os numeros ")
      leia(num)
      repita
          alg<-num Mod 10
           se(alg Mod 2 <>0)entao
           produto<-produto*alg
           fimse
           num<- num Div 10

       ate(0=num)
       escreval(c,"produto",produto)
   fimpara

fimAlgoritmo