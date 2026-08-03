import java.util.*;

@SuppressWarnings("rawtypes")
public class RawList_1 extends AbstractList {
    public Object get(int index) { throw new IndexOutOfBoundsException(); }
    public int size() { return 0; }
}
