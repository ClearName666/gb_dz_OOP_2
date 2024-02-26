import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * StreamServis
 */
public class StreamServis {
    public void SortGrups(ArrayList<Group> groups)
    {
        Collections.sort(groups, new StreamComparator());
    }
}