package campeonatosfifa.api.presentacion.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/obtener/{id}")
    public Seleccion obtener(@PathVariable int id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{dato}", method = RequestMethod.GET)
    public List<Seleccion> buscar(@PathVariable String dato) {
        return servicio.buscar(dato);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Seleccion agregar(@RequestBody Seleccion seleccion) {
        return servicio.agregar(seleccion);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Seleccion modificar(@RequestBody Seleccion seleccion) {
        return servicio.modificar(seleccion);
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
    public boolean eliminar(@PathVariable int id) {
        return servicio.eliminar(id);
    }

}
