/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    
    public static void main(String[] args) {
        Ciudad ciudad4 = new Ciudad("Loja");
        Ciudad ciudad5 = new Ciudad("Cuenca");
        Ciudad ciudad6 = new Ciudad("Guayaquil");
        
        Barrio barrio4 = new Barrio("El Valle",ciudad4);
        Barrio barrio5 = new Barrio("El Valle",ciudad5);
        Barrio barrio6 = new Barrio("El Valle",ciudad6);
        
        Persona persona4 = new Persona("Jean Villavicencio","1150042974",barrio4);
         Persona persona5 = new Persona("Duver Quezada","1156534765",barrio5);
          Persona persona6 = new Persona("Sebastian Mendieta","1589463245",barrio6);
          
            
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s Y pertenece a la "
                + "ciudad: %s\n",
                persona4.obtenerNombre(),
                persona4.obtenerBarrio().obtenerNombre(),
                persona4.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        persona5.establecerBarrio(barrio5);
        
        System.out.printf("El barrio de la persona %s es: %s Y pertenece a la "
                + "ciudad: %s\n",
                persona5.obtenerNombre(),
                persona5.obtenerBarrio().obtenerNombre(),
                persona5.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        
        barrio6.establecerCiudad(ciudad6);
        System.out.printf("El barrio de la persona es: %s Y pertenece a la "
                + "ciudad: %s\n",
                persona6.obtenerBarrio().obtenerNombre(),
                persona6.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
    
          
          
        // 1. Crear una persona de Barrio el Valle de la ciudad de Loja
        // 2. Crear una persona del Barrio Central de la ciudad de Cuenca
        // 3. Crear una persona del Barrio Centenario de la ciuda de Guayaquil
        
        
    }
}
