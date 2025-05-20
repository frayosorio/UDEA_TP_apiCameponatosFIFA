package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import campeonatosfifa.api.core.dominio.entidades.GrupoPais;
import campeonatosfifa.api.core.dominio.entidades.GrupoPaisId;

public interface IGrupoPaisRepositorio extends JpaRepository<GrupoPais, GrupoPaisId> {

    @Query("")
    public List<GrupoPais> listarPaises(int idGrupo);

}
