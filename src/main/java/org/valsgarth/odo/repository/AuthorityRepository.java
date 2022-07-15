package org.valsgarth.odo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.valsgarth.odo.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
