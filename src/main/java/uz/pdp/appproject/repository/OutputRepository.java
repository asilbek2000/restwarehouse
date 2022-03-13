package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.Output;
import uz.pdp.appproject.projection.CustomOutput;
import uz.pdp.appproject.projection.CustomUser;

@RepositoryRestResource(path = "output",collectionResourceRel = "list", excerptProjection =
        CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {
}
