package daniel.lucas.gerenciamentoeventos.repository;

import java.util.List;

public interface RepositoryAwareInterface<T> {
    public List<T> findAll();
    public T findById();
}
