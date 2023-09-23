package lk.ijse.techlead.api;

import lk.ijse.techlead.dto.TechLeadDTO;
import lk.ijse.techlead.service.TechLeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/techLead")
@CrossOrigin
public class TechLeadAPI {
   @Autowired
    TechLeadService techLeadService;

   @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void save(@ModelAttribute TechLeadDTO techLead){
     techLeadService.save(techLead);
   }
   @PutMapping("{id}")
    public void update(@PathVariable String id,@RequestBody TechLeadDTO techLeadDTO){
       techLeadService.update(id, techLeadDTO);
   }

   @DeleteMapping("{id}")
   public  void delete(@PathVariable String id){
     techLeadService.delete(id);
   }

   @GetMapping("{id}")
   public TechLeadDTO search(String id){
       return techLeadService.search(id);
   }

    @GetMapping(produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void getAll(){
       techLeadService.getAll();
    }


}
