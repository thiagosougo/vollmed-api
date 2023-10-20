package med.voll.api.domain.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String neighborhood;
    private String cep;
    private String number;
    private String complement;
    private String city;
    private String uf;

    public Address(AddressData address) {
        this.street = address.street();
        this.neighborhood = address.neighborhood();
        this.cep = address.cep();
        this.number = address.number();
        this.complement = address.complement();
        this.city = address.city();
        this.uf = address.uf();
    }

    public void updateInfo(AddressData address) {

        if(address.street() != null){
            this.street = address.street();
        }
        if(address.neighborhood() != null){
            this.neighborhood = address.street();
        }
        if(address.cep() != null){
            this.cep = address.street();
        }
        if(address.number() != null){
            this.number = address.street();
        }
        if(address.complement() != null){
            this.complement = address.street();
        }
        if(address.city() != null){
            this.city = address.street();
        }
        if(address.uf() != null){
            this.uf = address.street();
        }
    }
}
