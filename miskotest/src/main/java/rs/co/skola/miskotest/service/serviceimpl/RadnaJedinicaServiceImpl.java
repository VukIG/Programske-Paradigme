package rs.co.skola.miskotest.service.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import rs.co.skola.miskotest.model.RadnaJedinicaModel;
import rs.co.skola.miskotest.repo.RadnaJedinicaRepository;
import rs.co.skola.miskotest.service.RadnaJedinicaService;

@Service
public class RadnaJedinicaServiceImpl implements RadnaJedinicaService{

    RadnaJedinicaRepository radnaJedinicaRepository;

    public RadnaJedinicaServiceImpl(RadnaJedinicaRepository radnaJedinicaRepository){
        super();
        this.radnaJedinicaRepository = radnaJedinicaRepository;
    }

    @Override
    public RadnaJedinicaModel save(RadnaJedinicaModel entity){
        return radnaJedinicaRepository.save(entity);
    }

    @Override
    public RadnaJedinicaModel find(Long id){
        return radnaJedinicaRepository.findById(id).get();
    }

    @Override
    public List<RadnaJedinicaModel> listaRadnaJedinica(){
        return radnaJedinicaRepository.findAll();
    }

    @Override
    public RadnaJedinicaModel update(Long id, RadnaJedinicaModel entity){
        RadnaJedinicaModel r = find(id);
        r.azurirajRadnuJedinicu(entity);
        return r;
    }

    @Override
    public void delete(Long id){
        RadnaJedinicaModel r = find(id);
        if (r!=null) {
            radnaJedinicaRepository.delete(r);
        }
    }
}
