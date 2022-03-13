package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.Client;
import uz.pdp.appproject.entity.Currency;
import uz.pdp.appproject.entity.Output;
import uz.pdp.appproject.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
@Projection(types = Output.class)

public interface CustomOutput {
      Integer getId();
      Timestamp getDate();
      Warehouse getWarehouse();
      Currency getCurrency();
      String getFactureNumber();
      String getCode();
      Client getClient();

}
