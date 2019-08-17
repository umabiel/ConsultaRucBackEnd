package store.marathon.backend.model;

import lombok.Data;

@Data
public class Ruc {
    private String ruc;
    private String razon_social;
    private String estado;
    private String direccion;
    private String ubigeo;
    private String departamento;
    private String provincia;
    private String distrito;
}
