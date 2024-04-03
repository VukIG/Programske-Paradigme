package rs.co.skola.miskotest.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="zaposlen")
public class ZaposleniModel implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="ime",columnDefinition="VARCHAR(150)", nullable = false)
	private String ime;
	@Column(name="prezime",columnDefinition="VARCHAR(150)", nullable = false)
	private String prezime;
	@Column(name="email",columnDefinition="VARCHAR(150)", nullable = false)
	private String email;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public ZaposleniModel() {
		super();
	}
	
	public ZaposleniModel(Long id, String ime, String prezime, String email) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
	}

	public void azurirajZaposlenog(ZaposleniModel boban) {
        this.id = boban.getId();
		this.ime = boban.getIme();
		this.prezime = boban.getPrezime();
		this.email = boban.getEmail();
    }
}