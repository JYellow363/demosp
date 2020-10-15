package pe.edu.upc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.entity.Departamento;
import pe.edu.upc.repository.IDepartamentoRepository;
import pe.edu.upc.service.IDepartamentoService;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

	@Autowired
	private IDepartamentoRepository dptoR;

	@Override
	@Transactional
	public Integer insert(Departamento dpto) {
		int rpta = dptoR.buscarNombreDepartamento(dpto.getNombreDepartamento());
		if (rpta == 0) {
			dptoR.save(dpto);
		}
		return rpta;
	}

	@Override
	@Transactional
	public void delete(long idDepartamento) {
		dptoR.deleteById(idDepartamento);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> list() {
		// TODO Auto-generated method stub
		return dptoR.findAll(Sort.by(Sort.Direction.ASC, "nombreDepartamento"));
	}

}
