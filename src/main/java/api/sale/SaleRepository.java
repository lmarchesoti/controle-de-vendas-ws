package api.sale;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface SaleRepository extends PagingAndSortingRepository<Sale, Long> {

    List<Sale> findAll();
}