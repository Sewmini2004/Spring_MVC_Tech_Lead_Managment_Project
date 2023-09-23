package lk.ijse.techlead.repo;

import lk.ijse.techlead.entity.TechLead;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechLeadRepo extends JpaRepository<TechLead,String> {


}
