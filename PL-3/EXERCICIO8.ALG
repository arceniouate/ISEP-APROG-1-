Algoritmo "exercicio8"

Var
 produtoMaximo ,produtoAcomulado,num,maior :inteiro
Inicio
    produtoAcomulado<-1
    Escreval("insira o produto Maximo")
     leia(produtoMaximo)
     maior<-produtoMaximo
     enquanto (produtoAcomulado<=produtoMaximo) faca
       escreval("insira o numero")
        leia(num)
        enquanto (0>=num) faca
           escreval("numero invalido! o numero deve ser positivo")
           leia(num)
        fimenquanto
        se(num>maior)entao
           maior<-num
        fimse
        produtoAcomulado<-produtoAcomulado*num
   fimenquanto
   escreva("produto Maximo ",produtoAcomulado)
   escreva("maior",maior)
   
Fimalgoritmo