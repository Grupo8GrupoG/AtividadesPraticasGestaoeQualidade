
package praticarefatoracao;

import javax.swing.JOptionPane;

public class Equacao {
    private double a;
    private double b;
    private double c;
    private double discriminante;

    
    public Equacao(){
        a=0;
        b=0;
        c=0;
        discriminante=0;
    }
    
    public Equacao(double a,double b,double c,double discriminante){
        this.a=a;
        this.b=b;
        this.c=c;
        this.discriminante=discriminante;
    }
    
    public double getA() {
        return a;
    }

    
    public void setA(double a) {
        this.a = a;
    }

    
    public double getB() {
        return b;
    }

    
    public void setB(double b) {
        this.b = b;
    }

    
    public double getC() {
        return c;
    }

    
    public void setC(double c) {
        this.c = c;
    }
    
    
    public void calculaDiscriminante(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
        double discriminante;
        discriminante=Math.pow(b, 2)-4*a*c;
        JOptionPane.showMessageDialog(null, "O discriminante é: "+discriminante);
        this.discriminante=discriminante;
        
        if(discriminante<0){
            JOptionPane.showMessageDialog(null, "Está equação não possui raízes reais");
        }else if(discriminante==0){
            JOptionPane.showMessageDialog(null, "Está equação possui duas raízes reais iguais");
            double x1=(-b+Math.sqrt(discriminante))/2*a;
            JOptionPane.showMessageDialog(null,String.format( "A raíz da equação são %.3f" ,x1));
        }
        else if(discriminante>0){
            JOptionPane.showMessageDialog(null,"Está equação possui duas raízes reais diferentes");
            double x1=(-b+Math.sqrt(discriminante))/2*a;
            double x2=(-b-Math.sqrt(discriminante))/2*a;
            JOptionPane.showMessageDialog(null,String.format( "As raízes da equação são %.3f  e %.3f" ,x1,x2));
        } 
        

        
    }
    
    public void calculaEquacao(double a,double b,double c){
        
        if(a==0&&b==0&&c!=0){
            JOptionPane.showMessageDialog(null,"Coeficientes informados incorretamente");
        }
        else if(c==0){
            JOptionPane.showMessageDialog(null,"Igualdade confirmada 0=0");
        }
        
        if(a==0&&b!=0){
            JOptionPane.showMessageDialog(null, "Essa é uma equação de primeiro grau");
            JOptionPane.showMessageDialog(null, "A raíz da equação é: "+b/c);
        }
        
    }

}
