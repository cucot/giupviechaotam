package com.haotam.giupviec.bootstrap;

import com.haotam.giupviec.model.Biker;
import com.haotam.giupviec.model.Customer;
import com.haotam.giupviec.model.Employee;
import com.haotam.giupviec.model.Worker;
import com.haotam.giupviec.services.BikerService;
import com.haotam.giupviec.services.ContractService;
import com.haotam.giupviec.services.CustomerService;
import com.haotam.giupviec.services.EmployeeService;
import com.haotam.giupviec.services.WorkerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BikerService bikerService;
    private final ContractService contractService;
    private final CustomerService customerService;
    private final EmployeeService employeeService;
    private final WorkerService workerService;

    public DataInitializer(BikerService bikerService, ContractService contractService, CustomerService customerService, EmployeeService employeeService, WorkerService workerService) {
        this.bikerService = bikerService;
        this.contractService = contractService;
        this.customerService = customerService;
        this.employeeService = employeeService;
        this.workerService = workerService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.initWorker();
        this.initCustomer();
        this.initBiker();
        this.initEmployee();
    }

    private void initWorker() {
        Worker mrsNhung = new Worker();
        mrsNhung.setId(1L);
        mrsNhung.setFirstName("Nhung");
        mrsNhung.setMiddleName("Thị");
        mrsNhung.setLastName("Nguyễn");
        mrsNhung.setAddress("Thạch Thất, Hà Tây");
        mrsNhung.setPhoneNumber("0912567898");
        mrsNhung.setIdentityNumber("437857456843");

        Worker mrsLien = new Worker();
        mrsLien.setId(2L);
        mrsLien.setFirstName("Liên");
        mrsLien.setMiddleName("Hoàng");
        mrsLien.setLastName("Trần");
        mrsLien.setAddress("Ba Vì, Hà Tây");
        mrsLien.setPhoneNumber("0833758654");
        mrsLien.setIdentityNumber("956854234");

        //save 2 workers
        workerService.save(mrsNhung);
        workerService.save(mrsLien);
    }

    private void initCustomer() {
        Customer mrThanh = new Customer();
        mrThanh.setId(1L);
        mrThanh.setCustomerName("Nguyễn Công Thành");
        mrThanh.setAddress("Nhà 1107, CT4, Mễ Trì Sông Đà");
        mrThanh.setPhoneNumber("0985755843");

        Customer mrChau = new Customer();
        mrChau.setId(2L);
        mrChau.setCustomerName("Phan Quốc Châu");
        mrChau.setAddress("CT23 Kim Lũ, Đại Từ, Hoàng Mai");
        mrChau.setPhoneNumber("0388475224");

        customerService.save(mrThanh);
        customerService.save(mrChau);
    }

    private void initBiker() {
        Biker mrTuyen = new Biker();
        mrTuyen.setId(1L);
        mrTuyen.setFirstName("Tuyền");
        mrTuyen.setMiddleName("Văn");
        mrTuyen.setLastName("Phan");
        mrTuyen.setIdentityNumber("168594990");
        mrTuyen.setAddress("141 Phạm Văn Đồng, Cầu Giấy, Hà Nội");
        mrTuyen.setPhoneNumber("0975644532");
        mrTuyen.setVehicleNumber("29-H1 23997");

        Biker mrKhanh = new Biker();
        mrKhanh.setId(2L);
        mrKhanh.setFirstName("Khánh");
        mrKhanh.setMiddleName("Quốc");
        mrKhanh.setLastName("Trịnh");
        mrKhanh.setIdentityNumber("156447334");
        mrKhanh.setAddress("Số 14, Đồng Bát, Mỹ Đình 2, Nam Từ Liêm, Hà Nội");
        mrKhanh.setPhoneNumber("0915411636");
        mrKhanh.setVehicleNumber("29-P4 51466");

        bikerService.save(mrTuyen);
        bikerService.save(mrKhanh);
    }

    private void initEmployee() {
        Employee mrsLinh = new Employee();
        mrsLinh.setId(1L);
        mrsLinh.setFirstName("Linh");
        mrsLinh.setMiddleName("Thị");
        mrsLinh.setLastName("Trịnh");
        mrsLinh.setPhoneNumber("0913564111");
        mrsLinh.setIdentityNumber("185647834");

        Employee mrsMai = new Employee();
        mrsMai.setId(2L);
        mrsMai.setFirstName("Mai");
        mrsMai.setMiddleName("Thị");
        mrsMai.setLastName("Trịnh");
        mrsMai.setPhoneNumber("0984531985");
        mrsMai.setIdentityNumber("185644853");

        employeeService.save(mrsLinh);
        employeeService.save(mrsMai);
    }

}
