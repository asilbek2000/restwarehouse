package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.Warehouse;
import uz.pdp.appproject.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list", excerptProjection =
        CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
}
