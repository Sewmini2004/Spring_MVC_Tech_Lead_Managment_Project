package lk.ijse.techlead.repo;

import lk.ijse.techlead.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;



//entity eke name , primary key eke id ekai pass krnn oni
public interface ProjectRepo extends JpaRepository<Project,String> {


}
