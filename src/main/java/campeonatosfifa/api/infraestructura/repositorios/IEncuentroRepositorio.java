package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import campeonatosfifa.api.core.dominio.entidades.Encuentro;

public interface IEncuentroRepositorio extends JpaRepository<Encuentro, Integer> {

    @Query("SELECT e FROM Encuentro e WHERE e.campeonato.id=:idCampeonato ORDER BY e.fecha ASC")
    public List<Encuentro> listarCampeonato(int idCampeonato);

    @Query("SELECT e FROM Encuentro e WHERE e.campeonato.id =:idCampeonato AND e.fase.id = :idFase ORDER BY e.fecha ASC")
    public List<Encuentro> listarCampeonatoFase(int idCampeonato, int idFase);

    @Query("SELECT e FROM Encuentro e" +
            " JOIN Grupo g ON e.campeonato.id = g.campeonato.id" +
            " JOIN GrupoPais gp ON g.id=gp.grupo.id " +
            " AND (gp.pais.id = e.pais1.id  OR gp.pais.id = e.pais2.id)" +
            " WHERE g.id=:idGrupo")
    public List<Encuentro> listarGrupo(int idGrupo);

}
