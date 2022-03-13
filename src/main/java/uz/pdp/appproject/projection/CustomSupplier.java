package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.Supplier;

@Projection(types = Supplier.class)

public interface CustomSupplier {
    Integer getId();
    String getName();
    boolean isActive();
    String getPhoneNumber();
}
