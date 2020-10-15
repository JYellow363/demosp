package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Departamento;


@Repository
public interface IDepartamentoRepository extends JpaRepository<Departamento, Long> {
	@Query("select count(d.nombreDepartamento) from Departamento d where d.nombreDepartamento =:nombreDpto")
	public int buscarNombreDepartamento(@Param("nombreDpto") String nombreDepartamento);
}
