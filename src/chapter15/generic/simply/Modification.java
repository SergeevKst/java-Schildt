package chapter15.generic.simply;

@FunctionalInterface
public interface Modification<E> {
    E modification(E element);
}
