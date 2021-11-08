package com.app.repo;


import io.micronaut.data.repository.CrudRepository;
import java.util.Optional;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class StudentRepo  implements CrudRepository {


  /**
   * Saves the given valid entity, returning a possibly new entity representing the saved state.
   * Note that certain implementations may not be able to detect whether a save or update should be
   * performed and may always perform an insert. The {@link #update(Object)} method can be used in
   * this case to explicitly request an update.
   *
   * @param entity The entity to save. Must not be {@literal null}.
   * @return The saved entity will never be {@literal null}.
   * @throws ConstraintViolationException if the entity is {@literal null} or invalid.
   */
  @Override
  public Object save(Object entity) {
    return null;
  }

  /**
   * This method issues an explicit update for the given entity. The method differs from {@link
   * #save(Object)} in that an update will be generated regardless if the entity has been saved
   * previously or not. If the entity has no assigned ID then an exception will be thrown.
   *
   * @param entity The entity to save. Must not be {@literal null}.
   * @return The updated entity will never be {@literal null}.
   * @throws ConstraintViolationException if the entity is {@literal null} or invalid.
   */
  @Override
  public Object update(Object entity) {
    return null;
  }

  /**
   * This method issues an explicit update for the given entities. The method differs from {@link
   * #saveAll(Iterable)} in that an update will be generated regardless if the entity has been saved
   * previously or not. If the entity has no assigned ID then an exception will be thrown.
   *
   * @param entities The entities to update. Must not be {@literal null}.
   * @return The updated entities will never be {@literal null}.
   * @throws ConstraintViolationException if entities is {@literal null} or invalid.
   */
  @Override
  public Iterable updateAll(@Valid @NotNull Iterable entities) {
    return null;
  }

  /**
   * Saves all given entities, possibly returning new instances representing the saved state.
   *
   * @param entities The entities to saved. Must not be {@literal null}.
   * @return The saved entities objects. will never be {@literal null}.
   * @throws ConstraintViolationException if the entities are {@literal null}.
   */
  @Override
  public Iterable saveAll(@Valid @NotNull Iterable entities) {
    return null;
  }

  /**
   * Retrieves an entity by its id.
   *
   * @param o The ID of the entity to retrieve. Must not be {@literal null}.
   * @return the entity with the given id or {@literal Optional#empty()} if none found
   * @throws ConstraintViolationException if the id is {@literal null}.
   */
  @Override
  public Optional findById(Object o) {
    return Optional.empty();
  }

  /**
   * Returns whether an entity with the given id exists.
   *
   * @param o must not be {@literal null}.
   * @return {@literal true} if an entity with the given id exists, {@literal false} otherwise.
   * @throws ConstraintViolationException if the id is {@literal null}.
   */
  @Override
  public boolean existsById(Object o) {
    return false;
  }

  /**
   * Returns all instances of the type.
   *
   * @return all entities
   */
  @Override
  public Iterable findAll() {
    return null;
  }

  /**
   * Returns the number of entities available.
   *
   * @return the number of entities
   */
  @Override
  public long count() {
    return 0;
  }

  /**
   * Deletes the entity with the given id.
   *
   * @param o must not be {@literal null}.
   * @throws ConstraintViolationException if the entity is {@literal null}.
   */
  @Override
  public void deleteById(Object o) {

  }

  /**
   * Deletes a given entity.
   *
   * @param entity The entity to delete
   * @throws ConstraintViolationException if the entity is {@literal null}.
   */
  @Override
  public void delete(Object entity) {

  }

  /**
   * Deletes the given entities.
   *
   * @param entities The entities to delete
   * @throws ConstraintViolationException if the entity is {@literal null}.
   */
  @Override
  public void deleteAll(@NotNull Iterable entities) {

  }

  /**
   * Deletes all entities managed by the repository.
   */
  @Override
  public void deleteAll() {

  }
}
