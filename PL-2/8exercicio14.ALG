Algoritmo "exercicio14"

Var

area,  numeroPintores, diaNeces:inteiro
custoLitroTinta , rendimentoLitro, custoMObra, custoTintaU, salarioDia : real
Inicio
  Escreval("Insira a areia do edificio")
  leia(area)
   se((area>0) e(100>=area))entao
       numeroPintores<-1
   senao
        se((area>100) e (300>=area)) entao
             numeroPintores<-2
        senao
             se((area>300)e(1000>=area))entao
                 numeroPintores<-3
             senao
                  se(area>1000)entao
                numeroPintores<-4
                
                fimse

        fimse
  fimse
  fimse


Fimalgoritmo
