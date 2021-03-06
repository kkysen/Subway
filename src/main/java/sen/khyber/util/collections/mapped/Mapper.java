package sen.khyber.util.collections.mapped;

import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Khyber Sen on 2/1/2018.
 *
 * @author Khyber Sen
 */
@Accessors(fluent = true)
public class Mapper<T, R> {
    
    protected @Getter Function<? super T, ? extends R> mapper;
    
    protected Mapper(final @NotNull Function<? super T, ? extends R> mapper) {
        Objects.requireNonNull(mapper);
        this.mapper = mapper;
    }
    
    public final @Nullable R map(final T t) {
        return t == null ? null : mapper.apply(t);
    }
    
    protected final Consumer<? super T> accepting(final Consumer<? super R> action) {
        return t -> action.accept(map(t));
    }
    
}

// TODO add Mapped versions for all Collections