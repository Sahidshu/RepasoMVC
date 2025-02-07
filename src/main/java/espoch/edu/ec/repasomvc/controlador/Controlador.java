/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.repasomvc.controlador;

import espoch.edu.ec.repasomvc.vista.Principal;

/**
 *
 * @author sahid
 */
public class Controlador {
    private Principal objPrincipal;
   // private TesterController testerController;

    public Controlador(Principal objPrincipal) {
        this.objPrincipal = objPrincipal;
       // this.testerController = new TesterController();
    }
   /* 
    public void agregarTarea(){
        try{
          TesterController testerController = new TesterController();
           Tarea objTarea = new Tarea();
            objTarea.setTitulo(this.objPrincipal.getTitulo());
            objTarea.setDescripcion (this.objPrincipal.getDescripcion());
            objTarea.setEstado(this.objPrincipal.getEstado());
            
            if (this.objPrincipal != null){
                testerController.prueba(objTarea);
            }
            
        }catch (Exception e){
            
        }
    }  */
    
}
    
