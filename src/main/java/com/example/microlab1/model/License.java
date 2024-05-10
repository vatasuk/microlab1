package com.example.microlab1;

import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor(force=true)
public class License extends RepresentationModel<License> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    int id;

    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
