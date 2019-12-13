Algoritmo "exercio3"
var
num,num1,dig:inteiro
inicio
   leia (num)
   num1<-0
   enquanto((num mod 2 <>0) e (num mod 3=0)faca
         escreval("numero invalido!")
         escreval("o numero deve ser pare não multiploo de 3")
         escreval("Insira o numero")
         leia(num)
   fimenquanto
   enquanto (num<>0) faca
     dig<- num MOD 10
     num1<- num1*10+dig
     num<-num Div 10
   fimenquanto
   escreval("Resultado=",2*num1)
   


fimAlgoritmo