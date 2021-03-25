package co.eeikee.hrpayroll.domain;

import lombok.*;

import java.io.Serializable;

@Data
public class Payment implements Serializable {
    @NonNull private String name;
    @NonNull private Double dailyIncome;
    @NonNull private Integer days;

    public Double getTotal(){
        return dailyIncome*days;
    }
}
