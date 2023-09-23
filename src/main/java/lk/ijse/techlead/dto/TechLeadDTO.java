package lk.ijse.techlead.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TechLeadDTO {
    private String tecId;
    private String tecName;
    private String tecEmail;
    private String tecAddress;

}
