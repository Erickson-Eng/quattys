package br.com.quattys.backend.infrastructure.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configurable
@EnableJpaAuditing
public class JpaConfig {
}
