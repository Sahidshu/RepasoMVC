/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.repasomvc.tester;

import espoch.edu.ec.repasomvc.vista.Principal;

/**
 *
 * @author sahid
 */
public class TesterVista {
    private Principal objPrincipal;

    public TesterVista(Principal objPrincipal) {
        this.objPrincipal = objPrincipal;
    }
    
    public void prueba(){
        try {
        System.out.println("Titulo: "+objPrincipal.getTitulo());
        System.out.println("Titulo: "+objPrincipal.getDescripcion());
        System.out.println("Titulo: "+objPrincipal.getEstado());
            
        } catch (NumberFormatException e){
            
        }
    }
}
