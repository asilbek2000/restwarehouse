package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.User;
import uz.pdp.appproject.projection.CustomUser;
import uz.pdp.appproject.projection.CustomWarehouse;

@RepositoryRestResource(path = "users",collectionResourceRel = "list", excerptProjection =
        CustomUser.class)
public interface UserRepository extends JpaRepository<User,Integer> {
}
