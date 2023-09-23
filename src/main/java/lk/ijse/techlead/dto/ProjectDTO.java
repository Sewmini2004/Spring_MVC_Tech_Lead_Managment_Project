package lk.ijse.techlead.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ProjectDTO {
    private String proId;
    private String proName;
    private String proDescription;
    private int tecTeamCount;
}
