package lk.ijse.techlead.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Project implements SuperEntity{
    @Id
    private String proId;
    private String proName;
    private String proDescription;
    private int tecTeamCount;
    @ManyToOne
    private TechLead techLead;

}
