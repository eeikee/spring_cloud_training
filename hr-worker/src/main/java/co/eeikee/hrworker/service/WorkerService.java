package co.eeikee.hrworker.service;

import co.eeikee.hrworker.domain.Worker;
import co.eeikee.hrworker.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepository wr;

    public Worker findById(Long id){
       Optional<Worker> worker = wr.findById(id);
        return worker.isPresent() ? worker.get() : worker.orElseThrow(RuntimeException::new);
    }

    public List<Worker> findAll(){
        return wr.findAll();
    }
}
