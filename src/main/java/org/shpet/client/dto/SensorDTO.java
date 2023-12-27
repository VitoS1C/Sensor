package org.shpet.client.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SensorDTO {
    @NotNull(message = "Имя сенсора не может быть пустым!")
    @Size(min = 2, max = 30, message = "Имя сенсора должно быть от 2 до 30 символов!")
    private String name;
}
