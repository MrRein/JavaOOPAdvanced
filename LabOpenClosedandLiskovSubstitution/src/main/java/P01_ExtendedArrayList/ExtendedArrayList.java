package P01_ExtendedArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;

public class ExtendedArrayList<T extends Comparable<T>> extends ArrayList<T> {
    private T getBest(BiFunction<T, T, Boolean> func) {
        Iterator<T> iterator = super.iterator();
        T best = iterator.next();

        while (iterator.hasNext()) {
            T next = iterator.next();

            if (func.apply(next, best)) {
                best = next;
            }
        }

        return best;
    }

    public T max() {
        try {
            return this.getBest((t, t2) -> t.compareTo(t2) > 0);
        } catch (NoSuchElementException nsee) {
            return null;
        }
    }

    public T min() {
        try {
            return this.getBest((t, t2) -> t.compareTo(t2) < 0);
        } catch (NoSuchElementException nsee) {
            return null;
        }
    }
}
