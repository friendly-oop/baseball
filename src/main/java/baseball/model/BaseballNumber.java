package baseball.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public abstract class BaseballNumber {
    LinkedHashSet<Digit> number;

    public List<Digit> getNumber() {
        List<Digit> digits = new ArrayList<>();
        Iterator<Digit> iterator = number.iterator();
        while(iterator.hasNext()) {
            digits.add(iterator.next());
        }
        return digits;
    }
}
