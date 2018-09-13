package name.zemon.david.filebaseddbtrial.repository;

import name.zemon.david.filebaseddbtrial.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.lang.NonNull;

import java.util.Collection;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer>, QueryByExampleExecutor<Person> {
    Collection<Person> findAllByLastName(@NonNull String lastName);
}
