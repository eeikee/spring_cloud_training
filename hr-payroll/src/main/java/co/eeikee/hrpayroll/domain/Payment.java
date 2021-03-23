package co.eeikee.hrpayroll.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment {
    private String name;
    private Double dailyIncome;
    private Integer days;
}
