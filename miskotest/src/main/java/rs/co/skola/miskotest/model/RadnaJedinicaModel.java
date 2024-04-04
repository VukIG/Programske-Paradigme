package rs.co.skola.miskotest.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import rs.co.skola.miskotest.model.compositeKey.PK_radno_mesto_zaposleniKey;


@Entity
@Table(name="radna_jedinica")
public class RadnaJedinicaModel implements Serializable{

    @EmbeddedId
    private PK_radno_mesto_zaposleniKey id;

    @Column(name="datum_unosa", columnDefinition = "TIMESTAMP default '2024-01-01 01:00'", nullable = false)
    private Date datumUnosa;

    public RadnaJedinicaModel() {
        super();
    }

    public RadnaJedinicaModel(PK_radno_mesto_zaposleniKey id, Date datumUnosa) {
        this.id = id;
        this.datumUnosa = datumUnosa;
    }

    public PK_radno_mesto_zaposleniKey getId() {
        return id;
    }

    public void setId(PK_radno_mesto_zaposleniKey id) {
        this.id = id;
    }

    public Date getDatumUnosa() {
        return datumUnosa;
    }

    public void setDatumUnosa(Date datumUnosa) {
        this.datumUnosa = datumUnosa;
    }
    
    public void azurirajRadnuJedinicu(RadnaJedinicaModel radnaJedinicaModel){
        this.id = radnaJedinicaModel.getId();
        this.datumUnosa = radnaJedinicaModel.getDatumUnosa();
    }

}