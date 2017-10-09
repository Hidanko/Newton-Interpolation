/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

/**
 *
 * @author 6248489
 */
public class Newton {

    double x[];
    double f[];
    double valor;
    int size, i, j;
   // double auxiliar;
    double soma = 0;

    public Newton(double[] x, double[] f, double valor, int size) {

        this.x = new double[size];
        this.f = new double[size];
        
        this.size = size;
        this.x = x;
        this.f = f;
        this.valor = valor;
    }

    public Newton() {
    }

    public double calculo() {

        for (j = 0; j < size - 1; j++) {
            for (i = size - 1; i > j; i--) {
                f[i] = (f[i] - f[i - 1]) / (x[i] - x[i - j - 1]);
            }
        }
        for (i = size - 1; i >= 0; i--) {
            double mult = 1;
            for (j = 0; j < i; j++) {
                mult *= (valor - x[j]);
            }

            mult *= f[j];
            soma += mult;
        }

        return soma;
    }

}
