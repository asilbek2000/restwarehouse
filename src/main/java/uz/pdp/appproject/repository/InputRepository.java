package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.Input;
import uz.pdp.appproject.projection.CustomInput;
import uz.pdp.appproject.projection.CustomInputProduct;

@RepositoryRestResource(path = "input",collectionResourceRel = "list",
        excerptProjection =
                CustomInput.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
}
