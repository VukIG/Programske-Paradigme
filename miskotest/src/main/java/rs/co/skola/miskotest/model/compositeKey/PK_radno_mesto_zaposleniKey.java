package rs.co.skola.miskotest.model.compositeKey;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import rs.co.skola.miskotest.model.RadnoMestoModel;
import rs.co.skola.miskotest.model.ZaposleniModel;


@Embeddable
public class PK_radno_mesto_zaposleniKey implements Serializable {
    
    @ManyToOne
    @JoinColumn(name = "idZaposleni")
    private ZaposleniModel zaposleni;

    @ManyToOne
    @JoinColumn(name = "idRadnoMesto")
    private RadnoMestoModel radno_mesto;


    public PK_radno_mesto_zaposleniKey(ZaposleniModel zapsoleni, RadnoMestoModel radno_mesto){
        super();
        this.zaposleni = zapsoleni;
        this.radno_mesto = radno_mesto;
    }

    public PK_radno_mesto_zaposleniKey() {
        super();
    }

    

    public ZaposleniModel getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(ZaposleniModel zaposleni) {
        this.zaposleni = zaposleni;
    }

    public RadnoMestoModel getRadno_mesto() {
        return radno_mesto;
    }

    public void setRadno_mesto(RadnoMestoModel radno_mesto) {
        this.radno_mesto = radno_mesto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((zaposleni == null) ? 0 : zaposleni.hashCode());
        result = prime * result + ((radno_mesto == null) ? 0 : radno_mesto.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PK_radno_mesto_zaposleniKey other = (PK_radno_mesto_zaposleniKey) obj;
        if (zaposleni == null) {
            if (other.zaposleni != null)
                return false;
        } else if (!zaposleni.equals(other.zaposleni))
            return false;
        if (radno_mesto == null) {
            if (other.radno_mesto != null)
                return false;
        } else if (!radno_mesto.equals(other.radno_mesto))
            return false;
        return true;
    }

}
