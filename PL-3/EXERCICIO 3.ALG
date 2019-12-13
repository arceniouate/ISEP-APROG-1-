Algoritmo "exercicio 3"
Var
num,somaP,somaI,cont,qPares,qImpares,nImpare,nPare:inteiro
mediaP,mediaI,perceI,perceP:real
 Inicio
    cont<-0
    qPares<-0
    qImpares<-0
    Escreval("Insira a sequencia de numeros! para parar digite 0")
    leia(num)
    enquanto (num>0) faca
      leia(num)
      cont<-cont+1
       se (num mod 2=0)entao
          nPare<-num
          somaP<-somaP+num
          qPares<-qPares+1
        senao
         nImpare<-num
         somaI <-somaI+num
         qImpares<-qImpares+1
        fimse
    fimenquanto
    mediaP<-somaP/qPares
    mediaI<-somaI/qImpares
    perceI<-qImpares/100
    perceP<-qPares/100
     escreval("soma do numeros Pares",somaP," valor do contado ",cont,"contadores pares",qPares)
    escreval("media dos pares ", mediaP)
    escreval("media dos Impares", mediaI)
    escreval("percentagem Impares",perceP)
    escreval("percentagem pares ",perceI)
    fimalgoritmo

