/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.modweb;
import java.io.IOException;
import java.security.Principal;
import javax.inject.Named;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author vinh
 */

@Named
@RequestScoped
public class Login {
    
    public void logout() throws IOException {
//        FacesContext context = FacesContext.getCurrentInstance();
//        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
//        try {
//            request.logout();
//        } catch (ServletException e) {
//            context.addMessage(null, new FacesMessage("Logout failed."));
//        }
//      System.out.println("");
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.invalidateSession();
        ec.redirect("./");
    }
    public String test(){
        Principal principal = FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();
        if (principal != null) {
            return principal.getName();
        }
        return "";
    }
}
