Algoritmo "exercicio7"
var
num,alg,somaP:inteiro
 inicio
   escreval("Insira o numero")
   leia(num)
   enquanto (0>num) faca
      escreval("numero invalido! o numero tem que ser positivo)
      leia(num)
   fimenquanto
       repita
          alg<-num Mod 10
           se(alg Mod 2 =0)entao
           somaP<-somaP+alg
       fimse
       ate(num>0)
       escreval(somaP)

fimAlgoritmo