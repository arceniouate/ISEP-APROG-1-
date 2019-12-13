Algoritmo "exercico3 pl1"


Var
num, dig1, dig2,dig3,dig4:real
Inicio
  Escreval("Insira o 1º alg")
  leia(dig1)
  se(dig1<>0)entao
    se(dig1 MOD 2=0)entao
      escreval(" O algarismo deve ser impar não par")
      senao
      Escreval("Insira o 2º Alg")
      leia(dig2)
      se(dig2 MOD 2=0)entao
            escreval(" O algarismo deve ser impar não par")
            senao
            escreval("Insira o 3º")
            leia(dig3)
            se(dig3 MOD 2=0)entao
              escreval(" O algarismo deve ser impar não")
              senao
              num<-dig3+(dig2*10)+(dig1*100)//juntar os numeros
              escreva(" O numero : ",num," cuja a raiz e : ", raizQ(num))
            fimse
      fimse
    fimse
  fimse
Fimalgoritmo
