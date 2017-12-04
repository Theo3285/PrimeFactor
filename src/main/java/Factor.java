import java.util.List;

public interface Factor {
    List<Long> find(long aNumber) throws InvalidNumberException;
}
