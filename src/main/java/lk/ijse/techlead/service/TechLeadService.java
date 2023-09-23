package lk.ijse.techlead.service;

import lk.ijse.techlead.dto.TechLeadDTO;

import java.util.List;

public interface TechLeadService {
    void  save(TechLeadDTO techLeadDTO);
    void delete(String id);
    void update(String id,TechLeadDTO techLeadDTO);
    TechLeadDTO  search(String id);
    List<TechLeadDTO> getAll();


}
