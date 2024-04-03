package rs.co.skola.miskotest.service.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import rs.co.skola.miskotest.model.RadnoMestoModel;
import rs.co.skola.miskotest.repo.RadnoMestoRepository;
import rs.co.skola.miskotest.service.RadnoMestoService;

@Service
public class RadnoMestoServiceImpl implements RadnoMestoService {

    RadnoMestoRepository radnoMestoRepository;
    
    public RadnoMestoServiceImpl(RadnoMestoRepository radnoMestoRepository) {
        super();
        this.radnoMestoRepository = radnoMestoRepository;
    }

    @Override
    public RadnoMestoModel save(RadnoMestoModel entity) {
        return radnoMestoRepository.save(entity);
    }

    @Override
    public RadnoMestoModel find(Long id) {
        return radnoMestoRepository.findById(id).get();
    }

    @Override
    public List<RadnoMestoModel> listaRadnoMesto() {
        return radnoMestoRepository.findAll();
    }

    @Override
    public RadnoMestoModel update(Long id, RadnoMestoModel entity) {
       RadnoMestoModel z = find(id);
       z.azurirajRadnoMesto(entity);
       return z;
    }

    @Override
    public void delete(Long id) {
        RadnoMestoModel z = find(id);
        if(z==null){
            return;
        }
        radnoMestoRepository.delete(z);
    }

}