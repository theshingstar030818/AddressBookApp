package app.addressBook;

/**
 * Created by tanzeelrana on 2/2/2017.
 */

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface  AddressBookRepository extends PagingAndSortingRepository<AddressBook, Long>{
    List<AddressBook> findById(@Param("id") String id);
}
