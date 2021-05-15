
package praticarefatoracao03;

public class PraticaRefatoracao03 {

   //Integrantes do grupo: Gabriel Asevedo de Amorim RA:42113579 | Gabriela Gomides RA:42013488 | Guilherme de Almeida Oliveira RA:42014935 | Gabriel Augusto Ferreira Maia RA: 42014524 | Guilherme Asevedo de Amorim RA: 42015274  
   //Refatoração aplicada: Mover Método, Extrair Método
    
    public static void main(String[] args) {
        double vet1[]={90,88,78,76};
        double vet2[]={865,564,43,12};
        
        double resultadosoma;
        double resultadosoma1;
        
        Soma soma=new Soma();
        Media media=new Media();
        
        resultadosoma=soma.somar(0, vet1);
        resultadosoma1=soma.somar(0, vet2);
        
        System.out.println(soma.somar(0, vet1));
        System.out.println(soma.somar(0, vet2));
        
        System.out.println(media.calcularMedia(resultadosoma));
        System.out.println(media.calcularMedia(resultadosoma1));

        
    }
    
}
