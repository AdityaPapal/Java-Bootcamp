package io.aiven.spring.mysql.demo;

import org.springframework.data.repository.CrudRepository;

public interface userRepo extends CrudRepository<user,Integer> {


}
