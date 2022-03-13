package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.Measurment;
import uz.pdp.appproject.projection.CustomMeasurment;
import uz.pdp.appproject.projection.CustomWarehouse;

@RepositoryRestResource(path = "measurment",collectionResourceRel = "list", excerptProjection =
        CustomMeasurment.class)
public interface MeasurmentRepository extends JpaRepository<Measurment,Integer> {
}
