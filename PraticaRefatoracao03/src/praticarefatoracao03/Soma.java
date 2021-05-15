
package praticarefatoracao03;


public class Soma {
    
    private double soma;
    
    public double somar(double n1,double[] vet ){
        double soma=0;
        this.setSoma(soma);
        
        for(int i=0;i<4;i++){
            soma=soma+vet[i];
        }
        
        return soma;
    }
    
    public void setSoma(double soma) {
        this.soma = soma;
    }
    
   
    
    
}
