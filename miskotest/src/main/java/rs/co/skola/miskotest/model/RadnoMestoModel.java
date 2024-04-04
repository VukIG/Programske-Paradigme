package rs.co.skola.miskotest.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="radno_mesto")
public class RadnoMestoModel implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="naziv",columnDefinition="VARCHAR(150)", nullable = false)
	private String naziv;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public RadnoMestoModel() {
    }
    public RadnoMestoModel(Long id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }
	public void azurirajRadnoMesto(RadnoMestoModel boban) {
        this.id = boban.getId();
		this.naziv = boban.getNaziv();
    }
}