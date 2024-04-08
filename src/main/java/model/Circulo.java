package model;
import javax.swing.*;

public class Circulo extends Figura {	
	private double raio;	

	public Circulo() {		
		this("",0);	
	}	
	public Circulo(String cor, double raio) {		
		super(cor);		
		setRaio(raio);	
	}		
	
        public double getRaio () {
            return raio;
        }
	public void setRaio(double raio) {
            this.raio = raio;
        }	
        
        public void setRaio(String raio) {
            this.raio = Double.parseDouble(raio);
        }	
        
	public void leitura() {
            super.leitura();
            setRaio(JOptionPane.showInputDialog("Digite o raio: "));
        }	
	public void imprimir() {		
		super.imprimir();		
		JOptionPane.showMessageDialog(null,"O raio é " + getRaio());	
		JOptionPane.showMessageDialog(null,"A área é " + getArea());	
	}	
	public String paraString() {		
		return (super.paraString() + "/ Raio : " + getRaio());	
	}	
	public double getArea() {		
		return (Math.PI * getRaio() * getRaio());	
	}
}

