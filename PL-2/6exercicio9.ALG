Algoritmo "exercicio 9"

Var
//declaração das variaveis
horaP , minutosP, DHoras, DMinutos, horaCh, minCh : inteiro
Inicio
      escreval("Insira a hora de partida ") //mostrar a msg para o utilizador
      leia(horaP)  //ler as horas de partida
        se((horaP<0) ou (horaP>24 ))entao //condição que valida as horas para nao serem - ou horas >24
                  escreva("hora invalidas")//mgc se as horas forem invalidas

        senao
                 escreval("Insira os mintos de partida ")//mostrar msg com instrucoes ao utilizador
                leia(minutosP)  //leitura dos menutos insridos
                se((minutosP<0) ou (minutosP>59))entao// validation of minete
                                 escreva("minutos invalidos")

                senao
                    escreval("Insira  a hora da duração da viagem")
                    leia(DHoras)
                    se((DHoras<0) ou (DHoras>24 ))entao
                                escreva("horas ivalidas ")
                    senao
                         escreval("Insira os minutos da duração da viagem")
                         leia(DMinutos)
                         se((DMinutos<0) ou (DMinutos>59))entao
                                escreva("minutos invalidos")
                         senao
                               horaCh<- horaP+ DHoras
                                minCh<-minutosP+ DMinutos
                                 se((horaCh>=24) ou(minCh>=60))entao
                                 
                                    escreval("A hora de chegada é ",(horaCh-24)+1,":",(minCh-60)," Chega no dia senguinte")

                               senao

                                   escreval("A hora de chegada ",horaCh,":",minCh, " chega mo mesmo dia ")

                             
                         fimse
                fimse
        fimse

 FimAlgoritmo


fimse 