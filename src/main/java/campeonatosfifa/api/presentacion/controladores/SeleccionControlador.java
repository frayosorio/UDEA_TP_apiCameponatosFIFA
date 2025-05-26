package campeonatosfifa.api.presentacion.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campeonatosfifa.api.core.dominio.entidades.Seleccion;
import campeonatosfifa.api.core.interfaces.servicios.ISeleccionServicio;



@RestController
@RequestMapping("/api/selecciones")
public class SeleccionControlador {

    private ISeleccionServicio servicio;

    public SeleccionControlador(ISeleccionServicio servicio) {
        this.servicio = servicio;
    }

    
    @RequestMapping(value = "/listar")
    public List<Seleccion> listar() {
        return servicio.listar();
    }

}
