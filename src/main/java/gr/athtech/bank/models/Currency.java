package gr.athtech.bank.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Currency {
    private Integer id;
    private String name;
    private String symbol;
    private String code;
}
