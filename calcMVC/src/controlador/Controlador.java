package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;


// @author Gustavo

public class Controlador implements ActionListener{

       private Vista vista ;
       private Modelo modelo ;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.bCalcular.addActionListener(this); ;
        this.vista.rbDividir.addActionListener(this); ;
        this.vista.rbMultiplicar.addActionListener(this); ;
        this.vista.rbRestar.addActionListener(this); ;
        this.vista.rbSumar.addActionListener(this); ;
        this.vista.tfNum1.addActionListener(this); ;
        this.vista.tfNum3.addActionListener(this); ;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(this.vista.bCalcular)) {
            
            if (this.vista.rbDividir.get) {
                
            }
            
        }
        
    }
    
    

}
