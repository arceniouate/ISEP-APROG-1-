Algoritmo "exercicio5"

Var
limiteM, limiteF,limiteR,limiteB, aprovados : real
Inicio
      limiteM<-0,2
      limiteF<-0,5
      limiteR<-0,7
      limiteB<-0,9
      escreval("insira o numero de aprovado")
      leia(aprovados)
      se((aprovados<0)ou (aprovados>1))entao
           escreva("numero invalido")
      senao
          se(aprovados<limiteM)entao
             escreva("Turma Má")
          senao
             se(aprovados<limiteF)entao
                escreva("Turma Fraca")
             senao
                se(aprovados<limiteR)entao
                    escreva("Turma Rasoável")
                 senao
                    se(aprovados<limitesB)entao
                      escreva("Turma Boa")
                    senao
                      escreva("Turma Excelente")
                    fimse
                 fimse
           fimse
          fimse
      fimse
Fimalgoritmo