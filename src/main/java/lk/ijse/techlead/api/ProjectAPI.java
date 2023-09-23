package lk.ijse.techlead.api;

import lk.ijse.techlead.dto.ProjectDTO;
import lk.ijse.techlead.dto.TechLeadDTO;
import lk.ijse.techlead.service.ProjectService;
import lk.ijse.techlead.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/projectAPI")
@CrossOrigin
public class ProjectAPI {
    @Autowired
    ProjectService projectService;

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil save(@ModelAttribute ProjectDTO projectDTO){
        projectService.save(projectDTO);
        return new ResponseUtil(200,"Saved",null);
    }
    @PutMapping("{id}")
    public void update(@PathVariable String id,@RequestBody  ProjectDTO projectDTO){
        projectService.update(id,projectDTO);
    }

    @DeleteMapping("{id}")
    public  void delete(@PathVariable String id){
        projectService.delete(id);
    }

    @GetMapping("{id}")
    public ProjectDTO search(String id){
        return projectService.search(id);
    }

    @GetMapping(produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void getAll(){
        projectService.getAll();
    }


}
