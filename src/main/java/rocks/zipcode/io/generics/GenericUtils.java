package rocks.zipcode.io.generics;

import java.lang.reflect.Array;
import java.util.Collection;

public class GenericUtils {

    /**
     * @param collection - collection to be converted to an array
     * @param <T>        - type of collection
     * @return array with contents identical to `collection`
     */
    public static <T> T[] toArray(Collection<T> collection) {
//        T[] res = new T[];
        Object arr[] = new Object[collection.size()];
        int i = 0;
        for (T t : collection) {
            arr[i] = t;
            i++;
        }
        return (T[])arr;
    }
}
