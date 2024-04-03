package rs.co.skola.miskotest.service;

import java.util.List;

import rs.co.skola.miskotest.model.ZaposleniModel;

public interface ZaposleniService {
    public ZaposleniModel save(ZaposleniModel entity);
    public ZaposleniModel find(Long id);
    public List<ZaposleniModel> listaZaposlenih();
    public ZaposleniModel update(Long id, ZaposleniModel entity);
    public void delete(Long id);
}