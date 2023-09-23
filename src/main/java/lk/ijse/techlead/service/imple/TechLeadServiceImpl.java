package lk.ijse.techlead.service.imple;

import lk.ijse.techlead.dto.TechLeadDTO;
import lk.ijse.techlead.entity.TechLead;
import lk.ijse.techlead.repo.TechLeadRepo;
import lk.ijse.techlead.service.TechLeadService;
import lk.ijse.techlead.util.EntityDTOConversion;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TechLeadServiceImpl implements TechLeadService{
    @Autowired
    TechLeadRepo techLeadRepo;

    @Autowired
    EntityDTOConversion entityDTOConversion;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void save(TechLeadDTO techLeadDTO) {
        TechLead techLeadEntity = techLeadRepo.save(entityDTOConversion.getTechLeadEntity(techLeadDTO));
        techLeadRepo.save(techLeadEntity);

    }

    @Override
    public void delete(String id) {
        techLeadRepo.deleteById(id);
    }

    @Override
    public void update(String id, TechLeadDTO techLeadDTO) {
        TechLead techLeadEntity = techLeadRepo.save(entityDTOConversion.getTechLeadEntity(techLeadDTO));
        techLeadRepo.save(techLeadEntity);

    }

    @Override
    public TechLeadDTO search(String id) {
        TechLead techLead = techLeadRepo.findById(id).get();
        TechLeadDTO techLeadDTO = entityDTOConversion.getTechLeadDTO(techLead);
        return techLeadDTO;


    }

    @Override
    public List<TechLeadDTO> getAll() {
        List<TechLead> all = techLeadRepo.findAll();
        List<TechLeadDTO> techLeadDTOList = modelMapper.map(all, new TypeToken<List<TechLeadDTO>>(){}.getType());
        return techLeadDTOList;
    }
}
