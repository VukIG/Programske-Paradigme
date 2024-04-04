package rs.co.skola.miskotest.service;

import java.util.List;

import rs.co.skola.miskotest.model.RadnaJedinicaModel;

public interface RadnaJedinicaService{
    public RadnaJedinicaModel save(RadnaJedinicaModel entity);
    public RadnaJedinicaModel find(Long id);
    public List<RadnaJedinicaModel> listaRadnaJedinica();
    public RadnaJedinicaModel update(Long id, RadnaJedinicaModel entity);
    public void delete(Long id);
}