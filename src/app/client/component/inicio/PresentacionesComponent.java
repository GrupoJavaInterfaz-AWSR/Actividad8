/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component.inicio;


/**
 *
 * @author ssrs_
 */
public class PresentacionesComponent {

    private PresentacionesTemplate presentacionesTemplate;


    public PresentacionesComponent() {
        presentacionesTemplate = new PresentacionesTemplate(this);
        
    }

    public PresentacionesTemplate getPresentacionTemplate() {
        return this.presentacionesTemplate;
    }
}
