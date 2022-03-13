package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.User;
import uz.pdp.appproject.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.Set;
@Projection(types = User.class)

public interface CustomUser {
     Integer getId();
     String getFirstName();
     String getLastName();
     String getPhoneNumber();
    String getPassword();
     String getCode();
     boolean isActive();
     Set<Warehouse> getWarehouses();
}
