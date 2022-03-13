package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.Client;
import uz.pdp.appproject.entity.User;

@Projection(types = Client.class)

public interface CustomClient {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
