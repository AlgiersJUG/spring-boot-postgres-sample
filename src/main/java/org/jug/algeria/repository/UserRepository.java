package org.jug.algeria.repository;

import org.jug.algeria.domain.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<AppUser,Long>{
}
