package rs.co.skola.miskotest.service.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import rs.co.skola.miskotest.model.ZaposleniModel;
import rs.co.skola.miskotest.repo.ZaposleniRepository;
import rs.co.skola.miskotest.service.ZaposleniService;

@Service
public class ZaposleniServiceImpl implements ZaposleniService {

    ZaposleniRepository zaposleniRepository;
    
    public ZaposleniServiceImpl(ZaposleniRepository zaposleniRepository) {
        super();
        this.zaposleniRepository = zaposleniRepository;
    }

    @Override
    public ZaposleniModel save(ZaposleniModel entity) {
        return zaposleniRepository.save(entity);
    }

    @Override
    public ZaposleniModel find(Long id) {
        return zaposleniRepository.findById(id).get();
    }

    @Override
    public List<ZaposleniModel> listaZaposlenih() {
        return zaposleniRepository.findAll();
    }

    @Override
    public ZaposleniModel update(Long id, ZaposleniModel entity) {
       ZaposleniModel z = find(id);
       z.azurirajZaposlenog(entity);
       return z;
    }

    @Override
    public void delete(Long id) {
        ZaposleniModel z = find(id);
        if(z==null){
            return;
        }
        zaposleniRepository.delete(z);
    }

}