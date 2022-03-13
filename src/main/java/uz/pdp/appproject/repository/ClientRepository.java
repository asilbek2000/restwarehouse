package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.Client;
import uz.pdp.appproject.projection.CustomCategory;
import uz.pdp.appproject.projection.CustomClient;

@RepositoryRestResource(path = "client",collectionResourceRel = "list", excerptProjection =
        CustomClient.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
