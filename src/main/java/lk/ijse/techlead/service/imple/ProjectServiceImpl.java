package lk.ijse.techlead.service.imple;

import lk.ijse.techlead.dto.ProjectDTO;
import lk.ijse.techlead.dto.TechLeadDTO;
import lk.ijse.techlead.entity.Project;
import lk.ijse.techlead.entity.TechLead;
import lk.ijse.techlead.repo.ProjectRepo;
import lk.ijse.techlead.service.ProjectService;
import lk.ijse.techlead.util.EntityDTOConversion;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepo projectRepo;

    @Autowired
    EntityDTOConversion entityDTOConversion;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void save(ProjectDTO projectDTO) {
        if (!projectRepo.existsById(projectDTO.getProId())){
            Project projectEntity = projectRepo.save(entityDTOConversion.getProjectEntity(projectDTO));
            projectRepo.save(projectEntity);

        }
      }

    @Override
    public void delete(String id) {
        if(projectRepo.existsById(id)){
            projectRepo.deleteById(id);
        }

    }

    @Override
    public void update(String id, ProjectDTO projectDTO) {
        if (projectRepo.existsById(id)){
            Project projectEntity = projectRepo.save(entityDTOConversion.getProjectEntity(projectDTO));
            projectRepo.save(projectEntity);
        }

    }

    @Override
    public ProjectDTO search(String id) {
        if (projectRepo.existsById(id)){
            Project project = projectRepo.findById(id).get();
            ProjectDTO projectDTO = entityDTOConversion.getProjectDTO(project);
            return projectDTO;
        }
       return null;
    }

    @Override
    public List<ProjectDTO> getAll() {
        List<Project> all =projectRepo.findAll();
        List<ProjectDTO> projectDTOList= modelMapper.map(all, new TypeToken<List<ProjectDTO>>() {
        }.getType());
        return projectDTOList;
    }
}
