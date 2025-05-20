package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import campeonatosfifa.api.core.dominio.entidades.Fase;

public interface IFaseRepositorio extends JpaRepository<Fase, Integer> {

    @Query("SELECT f FROM Fase f WHERE f.nombre LIKE '%'|| :dato ||'%'") // JPQL
    public List<Fase> buscar(String dato);
}