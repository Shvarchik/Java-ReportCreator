package company.core.application.interfaces;

import java.util.Optional;

public interface Creator <T,TId> {

    T create ();
    boolean edit(T item);
    boolean remove(T item);
    Optional<T> getById (TId id);
    T get();

}