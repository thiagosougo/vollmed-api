package med.voll.api.domain.pacient;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.address.AddressData;

public record UpdatePacientData(
        @NotNull
        Long id,
        String name, String phone, AddressData address) {
}
