package br.com.quattys.backend.domain.repository;

import br.com.quattys.backend.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}