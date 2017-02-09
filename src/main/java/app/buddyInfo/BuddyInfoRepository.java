package app.buddyInfo;

/**
 * Created by tanzeelrana on 2/2/2017.
 */

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "buddy", path = "buddy")
public interface  BuddyInfoRepository extends PagingAndSortingRepository<BuddyInfo, Long>{
    List<BuddyInfo> findByFirstName(@Param("name") String name);
    List<BuddyInfo> findByLastName(@Param("name") String name);
    List<BuddyInfo> findByPhone(@Param("phone") String phone);
}

