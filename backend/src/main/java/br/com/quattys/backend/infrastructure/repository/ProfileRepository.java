package br.com.quattys.backend.infrastructure.repository;

import br.com.quattys.backend.domain.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}