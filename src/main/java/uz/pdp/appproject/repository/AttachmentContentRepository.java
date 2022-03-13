package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.AttachmentContent;
import uz.pdp.appproject.projection.CustomAttachmentContent;
import uz.pdp.appproject.projection.CustomCategory;

import java.util.Optional;
@RepositoryRestResource(path = "attachmentcontent",collectionResourceRel = "list",
        excerptProjection =
        CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

}
