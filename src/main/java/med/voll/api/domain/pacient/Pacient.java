package med.voll.api.domain.pacient;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.domain.address.Address;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Pacient")
@Table(name = "pacients")
public class Pacient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String cpf;
    private String phone;

    @Embedded
    private Address address;

    private Boolean active;

    public Pacient(RegisteredPacientsData data){
        this.name = data.name();
        this.email = data.email();
        this.phone = data.phone();
        this.cpf = data.cpf();
        this.address = new Address(data.address());
    }

    public void updateInfo(UpdatePacientData data) {
        if(data.name() != null) {
            this.name = data.name();
        }

        if(data.phone() != null) {
            this.phone = data.phone();
        }

        if(data.address() != null) {
            this.address.updateInfo(data.address());
        }
    }

    public void exclude() {
        this.active = false;
    }
}
