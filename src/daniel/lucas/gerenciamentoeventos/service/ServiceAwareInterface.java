
package daniel.lucas.gerenciamentoeventos.service;

public interface ServiceAwareInterface<T> {
    public boolean insert(T entity);
    public boolean update(T entity);
    public boolean delete(T entity);
}
