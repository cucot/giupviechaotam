package com.haotam.giupviec.bootstrap;

import com.haotam.giupviec.entity.Customer;
import com.haotam.giupviec.entity.Worker;
import com.haotam.giupviec.repositories.CustomerRepository;
import com.haotam.giupviec.repositories.WorkerRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

    private final WorkerRepository workerRepository;
    private final CustomerRepository customerRepository;

    public DataInitializer(WorkerRepository workerRepository, CustomerRepository customerRepository) {
        this.workerRepository = workerRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        this.initData();
    }

    private void initData() {
        Worker mrsNhung = new Worker();
        mrsNhung.setFirstName("Nhung");
        mrsNhung.setMiddleName("Thị");
        mrsNhung.setLastName("Nguyễn");
        mrsNhung.setAddress("Thạch Thất, Hà Tây");
        mrsNhung.setPhoneNumber("0912567898");
        mrsNhung.setIdentityNumber("437857456843");

        Worker mrsLien = new Worker();
        mrsLien.setFirstName("Liên");
        mrsLien.setMiddleName("Hoàng");
        mrsLien.setLastName("Trần");
        mrsLien.setAddress("Ba Vì, Hà Tây");
        mrsLien.setPhoneNumber("0833758654");
        mrsLien.setIdentityNumber("956854234");

        //save 2 workers
        workerRepository.save(mrsLien);
        workerRepository.save(mrsNhung);

        Customer mrThanh = new Customer();
        mrThanh.setCustomerName("Nguyễn Công Thành");
        mrThanh.setAddress("Nhà 1107, CT4, Mễ Trì Sông Đà");
        mrThanh.setPhoneNumber("0985755843");

        Customer mrChau = new Customer();
        mrChau.setCustomerName("Phan Quốc Châu");
        mrChau.setAddress("CT23 Kim Lũ, Đại Từ, Hoàng Mai");
        mrChau.setPhoneNumber("0388475224");

        customerRepository.save(mrThanh);
        customerRepository.save(mrChau);
    }
}
