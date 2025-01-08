package br.com.quattys.backend.domain.repository;

import br.com.quattys.backend.domain.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}