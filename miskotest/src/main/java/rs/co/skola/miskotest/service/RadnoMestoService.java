package rs.co.skola.miskotest.service;

import java.util.List;

import rs.co.skola.miskotest.model.RadnoMestoModel;

public interface RadnoMestoService {
    public RadnoMestoModel save(RadnoMestoModel entity);
    public RadnoMestoModel find(Long id);
    public List<RadnoMestoModel> listaRadnoMesto();
    public RadnoMestoModel update(Long id, RadnoMestoModel entity);
    public void delete(Long id);
}