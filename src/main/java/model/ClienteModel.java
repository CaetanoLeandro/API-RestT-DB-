package model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Data

@Entity
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private Long cep;
    @JsonFormat(pattern = "YYYY-MM-dd HH-mm-ss")
    @Builder.Default
    private LocalDateTime data = LocalDateTime.now();

    public ClienteModel() {
    }
}
