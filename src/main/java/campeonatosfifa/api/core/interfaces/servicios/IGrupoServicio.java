package campeonatosfifa.api.core.interfaces.servicios;

import java.util.List;

import campeonatosfifa.api.core.dominio.dtos.TablaPosicionDto;
import campeonatosfifa.api.core.dominio.entidades.Encuentro;
import campeonatosfifa.api.core.dominio.entidades.Grupo;

public interface IGrupoServicio {

    public List<Grupo> listar();

    public Grupo obtener(int id);

    public List<Grupo> buscar(String nombre);

    public Grupo agregar(Grupo grupo);

    public Grupo modificar(Grupo grupo);

    public boolean eliminar(int id);

    public List<TablaPosicionDto> obtenerTablaPosiciones(int id);

    public List<Encuentro> obtenerEncuentros(int id);

    public List<Grupo> listarCampeonato(int idCampeonato);

}
