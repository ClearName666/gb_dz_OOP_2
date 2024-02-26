import java.util.Comparator;

public class StreamComparator implements Comparator<Group> {

    @Override
    public int compare(Group o1, Group o2) {
        return Integer.compare(o1.getCnt(), o2.getCnt());
    }
    
}
