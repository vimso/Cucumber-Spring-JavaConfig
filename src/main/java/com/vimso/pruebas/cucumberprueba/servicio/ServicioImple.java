package com.vimso.pruebas.cucumberprueba.servicio;

import javax.inject.Named;

/**
 *
 * @author vimso
 */
@Named
public class ServicioImple implements IServicio{

    @Override
    public int suma(int sumandoA, int sumandoB) {
        return sumandoA+sumandoB;
    }

}
