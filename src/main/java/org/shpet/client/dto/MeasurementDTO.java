package org.shpet.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MeasurementDTO {
    private Double value;
    private Boolean isRaining;
    private SensorDTO sensor;
}
