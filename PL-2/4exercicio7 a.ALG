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
         escreval("triângulo equilatero")
      senao
         se((a=b) e (b<>c))entao
                escreval("Triângulo Isóscele")
         senao
                escreval("Triângulo escaleno")
         fimse
      fimse
      
Fimalgoritmo