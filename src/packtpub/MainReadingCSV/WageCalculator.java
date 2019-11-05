package packtpub.MainReadingCSV;

import java.util.Collections;
import java.util.Vector;
import java.util.function.BiFunction;

public class WageCalculator implements Calc {

    @Override
    public long sum(Vector vector) {
        long sum = 0;
        for (int i = 0; i < vector.size(); i++) {
            sum += (Integer) vector.get(i);
        }
        return sum;
    }

    @Override
    public int min(Vector vector) {
        return Collections.min((Vector<Integer>) vector);
    }

    @Override
    public int max(Vector vector) {
        return Collections.max((Vector<Integer>) vector);
    }
}
