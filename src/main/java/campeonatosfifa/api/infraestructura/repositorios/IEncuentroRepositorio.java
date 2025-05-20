package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import campeonatosfifa.api.core.dominio.entidades.Encuentro;

public interface IEncuentroRepositorio extends JpaRepository<Encuentro, Integer> {

    @Query("SELECT e FROM Encuentro e WHERE e.campeonato.id=:idCampeonato ORDER BY e.fecha ASC")
    public List<Encuentro> listarCampeonato(int idCampeonato);

    @Query("")
    public List<Encuentro> listarCampeonatoFase(int idCampeonato, int idFase);

    @Query("")
    public List<Encuentro> listarGrupo(int idGrupo);

}
