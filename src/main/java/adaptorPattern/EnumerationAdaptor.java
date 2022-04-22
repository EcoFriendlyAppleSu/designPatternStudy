package adaptorPattern;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdaptor implements Iterator {

    public Enumeration enumeration;

    /**
     * 생성자 주입
     * @param enumeration
     */
    public EnumerationAdaptor(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        // Iterator.super.remove();
        throw new UnsupportedOperationException();
    }
}
