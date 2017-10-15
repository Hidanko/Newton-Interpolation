/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import view.Tabela;

/**
 *
 * @author 6248489
 */
public class Newton {

    double x[];
    double f[];
    double valor;
    int size, i, j;
    double soma = 0;
    Tabela tabela;

    public Newton(double[] x, double[] f, double valor, int size) {

        this.x = new double[size];
        this.f = new double[size];
        
        this.size = size;
        this.x = x;
        this.f = f;
        this.valor = valor;
        tabela = new Tabela();
    }

    public Newton() {
    }


    public double calculo() {
        tabela.incrementarColuna(x);
        tabela.incrementarColuna(f);
        tabela.setVisible(true);
        for (j = 0; j < size - 1; j++) {
            for (i = size - 1; i > j; i--) {
                f[i] = (f[i] - f[i - 1]) / (x[i] - x[i - j - 1]);
                tabela.incrementarColuna(f);
            }
        }
        for (i = size - 1; i >= 0; i--) {
            
            double mult = 1.0;
            for (j = 0; j < i; j++) {
                mult *= (valor - x[j]);
            }

            mult *= f[j];
            soma += mult;
        }
        tabela.imprimirResultados(soma);
        return soma;
    }

}
