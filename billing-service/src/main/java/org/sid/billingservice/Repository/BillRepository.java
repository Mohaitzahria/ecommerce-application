package org.sid.billingservice.Repository;

import org.sid.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface BillRepository extends JpaRepository<Bill,Long> {
    @RestResource(path = "/byCustomerId")
    List<Bill> findCustomerById(@Param("customerId") Long Id);
}