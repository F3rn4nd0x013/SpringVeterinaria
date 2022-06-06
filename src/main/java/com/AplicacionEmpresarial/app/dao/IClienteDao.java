package com.AplicacionEmpresarial.app.dao;

import java.util.List;

import com.AplicacionEmpresarial.app.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();

	public void save(Cliente cliente);

	public void delete(Long id);

	public Cliente findone(Long id);

}
