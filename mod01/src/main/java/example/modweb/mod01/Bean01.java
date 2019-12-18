/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.modweb.mod01;

import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author vinh
 */
@Named
@ViewScoped
public class Bean01 implements Serializable{
    public String getName(){
        return "Hello from Bean01. JSF Version: " + FacesContext.class.getPackage().getImplementationVersion();
    }
}
