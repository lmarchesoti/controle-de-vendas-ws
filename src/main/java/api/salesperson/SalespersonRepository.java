package api.salesperson;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "salespeople", path = "salespeople")
public interface SalespersonRepository extends PagingAndSortingRepository<Salesperson, Long> {

    /*
    private static final List<Salesperson> SALESPEOPLE = {
        new Salesperson(0, "Jonathan Smith"),
        new Salesperson(1, "Barbara")
    };

    List<Salesperson> findAll() {
        return new SALESPEOPLE;
    };
    */
    
    List<Salesperson> findAll();
}