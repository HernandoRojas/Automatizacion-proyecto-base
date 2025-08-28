package steps;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PerfilGitHub;


public class AbrirPerfil {
    
    PerfilGitHub perfil = new PerfilGitHub();

    @Given("El usuario navega al perfil de GitHub de Hernando Rojas")
    public void irAUrlDelPerfil(){
        perfil.irAPerfil();
    }

    @Then("visualiza el nombre Hernando José Rojas Castro")
    public void validarNombre(){
        String nombreEsperado = "Hernando José Rojas Castr";
        String nombreElemento = perfil.obtenerNombreDelPerfil();

        Assert.assertEquals(nombreElemento, nombreEsperado);
    }

}
