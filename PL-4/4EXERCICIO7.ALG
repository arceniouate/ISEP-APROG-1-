Algoritmo "EXERCICIO7"

Var
num,inversa,n,ordem,alg:inteiro


Inicio
inversa<-0
ordem<-1
escreval("Insira o numero com mais de 2 alg")
leia(num)
n<-num
   se(10>=num)entao
       escreval("numero invalido o numero deve ter mais de 2 alg ")
       escreval("Insira o numero")
      leia(num)
   fimse
   enquanto (num<>0) faca
      alg<-num mod 10
      inversa<- inversa+alg*10
      num<-num div 10
      ordem<-ordem+1
      escreval("ordem",ordem)
   fimenquanto
   escreval(inversa)
   //se(num=inversa)entao
     //escreval("num e capicua ")
   //senao
     //escreval("num não e capicua ")
   //fimse

Fimalgoritmo