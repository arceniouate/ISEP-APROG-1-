Algoritmo "exercicio 6"

Var
somaMaxima,somaAcomulada,menor, num:inteiro
inicio
  somaAcomulada<-0
  escreval("Insira o valor da Numero")
  leia(somaMaxima)
      menor<-somaMaxima
  enquanto (somaAcomulada<=somaMaxima) faca
       leia(num)
     enquanto (num<=0) faca
         escreval("num invalido")
         leia(num)
     fimenquanto
         se (num<menor) entao
             menor<-num
           fimse
     somaAcomulada<- somaAcomulada+num
 fimenquanto
   escreval("valor da somaAcomulada",somaAcomulada)
                  escreval("o menor numero de todos e : ",menor)
Fimalgoritmo
