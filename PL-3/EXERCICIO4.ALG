Algoritmo "exercio4"
//to do ler ler o exercicio e comprender e tirar a prova hoje
Var
maximo,minimo,i: inteiro

Inicio
       escreval("insira o limite minino ")
       leia(minimo)
       escreval("insira o limte maximo")
       leia(maximo)
     enquanto (minimo>maximo) faca
        Escreval("numero invalido")
        leia(minimo)
        leia(maximo)
     fimenquanto
     para i<-minimo ate maximo passo 1 faca
       se((i Mod 2=0) e(i Mod 3=0))entao
           escreval(i)
         fimse
    
   fimpara

Fimalgoritmo