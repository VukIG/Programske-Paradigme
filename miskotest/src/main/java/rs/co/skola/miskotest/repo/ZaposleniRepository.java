package rs.co.skola.miskotest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import rs.co.skola.miskotest.model.ZaposleniModel;

public interface ZaposleniRepository extends JpaRepository<ZaposleniModel, Long> {

}