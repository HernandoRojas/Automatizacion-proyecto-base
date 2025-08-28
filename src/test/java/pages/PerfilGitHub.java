package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PerfilGitHub extends BasePage{
    
    private String localizadorNombre = "//span[@class='p-name vcard-fullname d-block overflow-hidden']";
    private String urlPerfil = "https://github.com/HernandoRojas";

    public PerfilGitHub(){
        super(driver);
    }

    public void irAPerfil(){
        navigateTo(urlPerfil);
    }  

    public String obtenerNombreDelPerfil(){
        return obtenerTextoDeElementoWeb(localizadorNombre);
    }
}
