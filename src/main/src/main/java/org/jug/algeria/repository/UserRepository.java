package org.jug.algeria.repository;

import org.jug.algeria.domain.User;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource(value = "classpath:org/jug/algeria/db/postgres.properties")
public interface UserRepository extends CrudRepository<User,Long>{

}
