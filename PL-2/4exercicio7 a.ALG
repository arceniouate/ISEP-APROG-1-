Algoritmo "exercicio7a"

Var
a,b,c :inteiro
Inicio
      Escreval("Insira a medida do lado a")
leia(a)
       Escreval("Insira a medida do lado b")
leia(b)
       Escreval("Insira a medida do lado c")
leia(c)

      se((a=b) e (b=c))entao
         escreval("tri�ngulo equilatero")
      senao
         se((a=b) e (b<>c))entao
                escreval("Tri�ngulo Is�scele")
         senao
                escreval("Tri�ngulo escaleno")
         fimse
      fimse
      
Fimalgoritmo