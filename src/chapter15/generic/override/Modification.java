package chapter15.generic.override;

@FunctionalInterface
public interface Modification<E> {
    E modification(E element);
}
