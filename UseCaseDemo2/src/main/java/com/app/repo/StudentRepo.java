package com.app.repo;


import io.micronaut.data.repository.CrudRepository;
import java.util.Optional;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface StudentRepo  extends CrudRepository {



}
