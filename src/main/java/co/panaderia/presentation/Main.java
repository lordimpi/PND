/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.panaderia.presentation;

import co.panaderia.domain.entitys.Persona;
import co.panaderia.domain.services.PersonaService;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Santiago Acuña
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se prendio esta mondaa.");
        PersonaService pc = new PersonaService();
        List<Persona> listaPersonas;
        listaPersonas = pc.list();

        listaPersonas.forEach(element -> {
            System.out.println(element.toString());
        });
    }

}