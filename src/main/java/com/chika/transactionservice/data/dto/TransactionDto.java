package com.chika.transactionservice.data.dto;

import com.chika.transactionservice.util.enums.TransactionType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransactionDto {
    private String accountNo;
    private BigDecimal amount;
    private TransactionType transactionType;

}
