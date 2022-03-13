package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.Warehouse;

@Projection(types = Warehouse.class)

public interface CustomWarehouse {
     Integer getId();
     String getName();
     boolean isActive();
}
