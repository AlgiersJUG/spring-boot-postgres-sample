package org.jug.algeria.repository;

import org.jug.algeria.domain.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppUser, Long> {
}
