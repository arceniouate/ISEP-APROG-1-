Algoritmo "exercico 5"
var
num ,base ,ordem ,alg:inteiro
decimal:real
inicio
  ordem<-0
  base<-8
   escreval("Insira um numero inteiro")
   leia (num )
   enquanto (0>=num) faca
     escreval("numero invalido! o numero deve ser inteiro")
     leia(num)
   fimenquanto
  enquanto (num<>0) faca
       alg<-num Mod 10
       decimal<-decimal+alg*base^ordem
       num<- num Div 10
       ordem<-ordem+1
    fimenquanto
    escreval("Numero Decimal: ",decimal)
Fimalgoritmo