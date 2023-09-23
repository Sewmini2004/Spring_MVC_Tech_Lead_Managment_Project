package lk.ijse.techlead.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TechLead implements SuperEntity{
    @Id
    private String tecId;
    private String tecName;
    private String tecEmail;
    private String tecAddress;
    @OneToMany(mappedBy = "techLead",cascade = CascadeType.ALL)
    private List<Project> projects;
}
