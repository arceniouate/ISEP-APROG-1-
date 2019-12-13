Algoritmo "exercicio7b"
Var
a,b,c :inteiro
Inicio
      Escreval("Insira a medida do lado a")
  leia(a)
  se(a<0)entao
     escreval("medida invalida! a medida dos lados de um triagulo tem que se um nº +")
  senao
       Escreval("Insira a medida do lado b")
       leia(b)
       se(b<0)entao
             escreval("medida invalida! a medida dos lados de um triagulo tem que se um nº +")
       senao
                  escreval("Insira a medida do lado c")
                  leia(c)
                  se(c<0)entao
                       escreval("medida invalida! a medida dos lados de um triagulo tem que se um nº +")
                  senao
                       se(((a+b)<c)ou((b+c)<a)ou ((a+c)<b))entao
                             escreval("a soma de um lado não pode ser maior que 1")
                       senao
                             se((a<>b) e (b<>c)e (c<>a))entao
                                  escreval("triângulo escaleno")
                             senao
                                   se((a=b) e (a=c)e (b=c))entao
                                        escreval("Triângulo equilatero")
                                   senao
                                      escreval("Triângulo isósceles")
                       fimse
                    fimse
                 fimse
         fimse
      fimse
 fimse
Fimalgoritmo