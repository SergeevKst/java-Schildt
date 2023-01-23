package chapter15.exception;

import java.io.IOException;

public interface Saver {
    void save(Object obj) throws IOException;
}
