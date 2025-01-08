package br.com.quattys.backend.domain.repository;

import br.com.quattys.backend.domain.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}