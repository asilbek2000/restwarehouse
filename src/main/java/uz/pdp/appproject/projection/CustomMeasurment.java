package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.Category;
import uz.pdp.appproject.entity.Measurment;

@Projection(types = Measurment.class)

public interface CustomMeasurment {
    Integer getId();
    String getName();
    boolean isActive();
}
