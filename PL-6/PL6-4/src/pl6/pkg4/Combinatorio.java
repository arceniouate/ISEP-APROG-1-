/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6.pkg4;

/**
 * *
 * Disponibiliza os metodos associados a combinatorios
 *
 * @author arccenio
 */
public class Combinatorio {

    /**
     * *
     * Calculo do fatorial de um numero
     *
     * @param n numero inteirro nao negativo
     * @return o valor deo fatorial
     */
    public int fatorial(int n) {
        int fatorial = 1;
        for (int i = n; i > 1; i = i - 1) {
            fatorial = fatorial * i;
        }
        return fatorial;

    }
    public  int  perm(int   n){
       
            
       return Arranjo( n, n);
        
    }

    public int Arranjo(int n, int p) {
        int  per = 0;
       if (p>=n) {
            return -1;
        } else {
           int aux=n-p;
            per=fatorial(n)/fatorial(n-p);

        }
        return per;
    }
    /**
* Calcula o combinações de n p a p
**
@param n número inteiro não negativo
* @param p número inteiro não negativo
* @return o valor combinações de n p a p ou -1 caso n<p
*/
public  int combinacoes(int n, int  p )
{
if(n<p)
return -1;
return fatorial(n)/(fatorial(p)*fatorial(n-p));
}
}

