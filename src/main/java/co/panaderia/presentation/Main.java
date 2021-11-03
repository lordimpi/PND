/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.panaderia.presentation;

import co.panaderia.domain.entitys.Empleado;
import co.panaderia.domain.entitys.Producto;
import co.panaderia.domain.services.EmpleadoService;
import co.panaderia.domain.services.ProductoService;
import java.util.List;

/**
 *
 * @author Santiago Acuña
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoService pc = new EmpleadoService();
        List<Empleado> listaPersonas;
        listaPersonas = pc.list();

        listaPersonas.forEach(element -> {
            System.out.println(element.toString());
        });
    }
}
