package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.Attachment;
import uz.pdp.appproject.entity.Client;

@Projection(types = Attachment.class)

public interface CustomAttachment {
    Integer getId();
    String getName();
    String getContentType();
     long getSize();

}
