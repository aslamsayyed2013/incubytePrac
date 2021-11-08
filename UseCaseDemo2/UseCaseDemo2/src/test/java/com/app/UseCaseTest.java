package com.app;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import io.micronaut.data.repository.CrudRepository;
import io.micronaut.http.annotation.Controller;
import javax.persistence.Entity;
import org.springframework.web.bind.annotation.RestController;

@AnalyzeClasses(packages = "com.app")
public class UseCaseTest {

  @ArchTest
  static final ArchRule class_implementing_crudrepository_should_have_name_ending_with_repository =
    /*  classes().that().implement(CrudRepository.class)
          .should().haveSimpleNameEndingWith("Repo");*/
      classes().that().areInterfaces().should().beAssignableTo(CrudRepository.class)
          .andShould().haveSimpleNameEndingWith("Repo");
  @ArchTest
  static final ArchRule class_inside_controller_should_have_name_ending_with_controller =
     /* classes().that().haveSimpleNameEndingWith("Controller")
        .should().resideInAPackage("com.app.controller");*/
      classes().that().resideInAPackage("com.app.controller")
          .should().haveSimpleNameEndingWith("Controller");

  @ArchTest
  static final ArchRule class_inside_service_package_should_have_name_ending_with_service =
      /*classes().that().haveSimpleNameEndingWith("Service")
          .should().resideInAPackage("com.app.service");*/
      classes().that().resideInAPackage("com.app.service")
          .should().haveSimpleNameEndingWith("Service");

  @ArchTest
  static final ArchRule class_inside_controller_should_have_name_annotated_with_controller =
    /*  classes().that().resideInAPackage("com.app.controller")
          .should().haveSimpleNameEndingWith("Controller");*/
  classes().that().resideInAPackage("..controller..").should()
      .beAnnotatedWith(RestController.class);


  @ArchTest
  static final ArchRule class_inside_pojo_package_should_have_name_annotated_with_entity =
      classes().that().resideInAPackage("..repo..").should()
          .beAnnotatedWith(Entity.class);


  @ArchTest
  static final ArchRule class_inside_controller_package_should_not_directly_used_by_repository =
      layeredArchitecture()
          .layer("Controller").definedBy("..controller..")
          .layer("Service").definedBy("..service..")
          .layer("Repository").definedBy("..repo..")
          .whereLayer("Controller").mayNotBeAccessedByAnyLayer()
          .whereLayer("Repository").mayOnlyBeAccessedByLayers("Service")
          .whereLayer("Service").mayOnlyBeAccessedByLayers("Controller");


}


