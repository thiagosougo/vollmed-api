package med.voll.api.domain.doctor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.domain.address.AddressData;

public record RegisteredDoctorsData(
        @NotBlank
        String name,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String phone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        Speciality speciality,

        @NotNull
        @Valid
        AddressData address
) {

}
