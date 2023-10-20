package med.voll.api.domain.pacient;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.domain.address.AddressData;

public record RegisteredPacientsData(
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank String phone,
        @NotBlank @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}") String cpf,
        @NotNull @Valid AddressData address) {
}
