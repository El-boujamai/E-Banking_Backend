package org.ouardia.projet_tousfi.dtos;

import lombok.Data;
import org.ouardia.projet_tousfi.enums.OperationType;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}

