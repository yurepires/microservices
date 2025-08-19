package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
@Data
public class AccountsDto {

    @Schema(
            description = "Account number of EazyBank account", example = "3454433243"
    )
    @NotEmpty(message = "Account number can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of EazyBank account", example = "Savings"
    )
    @Column(name = "account_type")
    @NotEmpty(message = "Account type can not be null or empty")
    private String accountType;

    @Schema(
            description = "EazyBank branch address", example = "123 New York"
    )
    @Column(name = "branch_address")
    @NotEmpty(message = "Branch address can not be null or empty")
    private String branchAddress;
}
