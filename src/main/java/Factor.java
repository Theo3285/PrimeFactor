import java.util.List;

public abstract class Factor {
    public abstract List<Long> find(long aNumber) throws InvalidNumberException;
}
