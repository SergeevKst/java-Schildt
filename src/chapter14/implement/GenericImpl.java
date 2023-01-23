package chapter14.implement;
/*
Возможности расширения обобщенного интерфейса
 */
public class GenericImpl implements Generic {
    @Override
    public Object get() {
        return null;
    }

    class DuoGenericImpl<T> implements Generic<T> {

        @Override
        public T get() {
            return null;
        }
    }

    class ThreeGenericImpl implements Generic<String> {
        @Override
        public String get() {
            return null;
        }
    }
}
