package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.core.dominio.entidades.Estadio;

@Repository
public interface IEstadioRepositorio extends JpaRepository<Estadio, Integer> {

    @Query("SELECT e FROM Estadio e WHERE e.nombre LIKE '%'|| :dato ||'%'") // JPQL
    public List<Estadio> buscar(String dato);
}