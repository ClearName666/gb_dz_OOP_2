import java.util.ArrayList;

public class Stream  implements Iterable<String, Integer>{

    ArrayList<Group> groups = new ArrayList<>();

    @Override
    public void add(String t1, Integer t2) {
        Group group = new Group(t1, t2);
        groups.add(group);
    }

    @Override
    public Integer get(Integer index) {
        return groups.get(index).getCnt();
    }
    public void addGroup(Group group)
    {
        groups.add(group);
    }
    public void printAllGroup()
    {
        for (int i = 0; i < groups.size(); i++)
            System.out.println("name =" + groups.get(i).getName() + " cnt=" + groups.get(i).getCnt());
        System.out.println("\n");
    }
    
}
