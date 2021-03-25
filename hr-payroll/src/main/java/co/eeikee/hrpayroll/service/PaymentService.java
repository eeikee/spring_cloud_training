package co.eeikee.hrpayroll.service;

import co.eeikee.hrpayroll.domain.Payment;
import co.eeikee.hrpayroll.domain.Worker;
import co.eeikee.hrpayroll.feignclient.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient wfc;

    public Payment getPayment(Long workerId, int days){
        Worker worker = wfc.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
