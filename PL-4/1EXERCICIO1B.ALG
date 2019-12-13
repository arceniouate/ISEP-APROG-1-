Algoritmo "exercio1b"
var
num,alg,somaP:inteiro
 inicio
 somaP<-0
   escreval("Insira o numero")
   leia(num)
   enquanto (0>=num) faca
      escreval("numero invalido! o numero tem que ser positivo")
      leia(num)
   fimenquanto
       repita
          alg<-num Mod 10
           se(alg Mod 2 =0)entao
           somaP<-somaP+alg
       fimse
         num<- num Div 10
       ate(0=num)
       escreval(somaP)

fimAlgoritmo