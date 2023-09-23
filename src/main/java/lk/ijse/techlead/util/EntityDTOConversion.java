package lk.ijse.techlead.util;

import lk.ijse.techlead.dto.ProjectDTO;
import lk.ijse.techlead.dto.TechLeadDTO;
import lk.ijse.techlead.entity.Project;
import lk.ijse.techlead.entity.TechLead;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
@Component
public class EntityDTOConversion {
    private final ModelMapper modelMapper;


    EntityDTOConversion(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public TechLead getTechLeadEntity(TechLeadDTO techLeadDTO){
        return modelMapper.map(techLeadDTO,TechLead.class);
    }


    public TechLeadDTO getTechLeadDTO(TechLead techLead){
        return modelMapper.map(techLead,TechLeadDTO.class);
    }


    public Project getProjectEntity(ProjectDTO projectDTO){
        return modelMapper.map(projectDTO, Project.class);
    }

    public ProjectDTO getProjectDTO(Project project){
        return modelMapper.map(project, ProjectDTO.class);
    }



}
