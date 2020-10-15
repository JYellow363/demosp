package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Departamento;

public interface IDepartamentoService {
	public Integer insert(Departamento dpto);

	public void delete(long idDepartamento);

	List<Departamento> list();

}
