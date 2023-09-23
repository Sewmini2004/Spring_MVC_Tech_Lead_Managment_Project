package lk.ijse.techlead.service;

import lk.ijse.techlead.dto.ProjectDTO;
import lk.ijse.techlead.dto.TechLeadDTO;

import java.util.List;

public interface ProjectService {
    void  save(ProjectDTO projectDTO);
    void delete(String id);
    void update(String id,ProjectDTO projectDTO);
    ProjectDTO search(String id);
    List<ProjectDTO> getAll();

}
