package model;

import javax.swing.JOptionPane;

public class Figura {
    String cor;		

    public Figura () {
            this("");	
    }	
    public Figura (String cor){			
            setCor(cor);	
    }	
    public String getCor() {		
            return cor;	
    }	
    public void setCor(String cor ) {		
            this.cor = cor;	
    }	
    public double getArea() { // Testa o Override, retornando area como 0 caso não tenha o getArea das subclasses.
        return 0;
    }
    public void leitura() {	
            setCor(JOptionPane.showInputDialog("Digite a Cor"));	
    }	
    public void imprimir() {		
            JOptionPane.showMessageDialog(null,"A cor é " + getCor());	
    }	
    public String paraString() {		
            return ("Cor : " + getCor());	
    }

}
