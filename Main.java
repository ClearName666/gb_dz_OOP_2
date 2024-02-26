public class Main {
    public static void main(String[] args) {
        Group group1 = new Group("g1", 20);
        Group group2 = new Group("g2", 14);
        Group group3 = new Group("g3", 30);
        Group group4 = new Group("g4", 5);
        Group group5 = new Group("g5", 51);
        Group group6 = new Group("g6", 6);

        Stream stream = new Stream();
        stream.addGroup(group1);
        stream.addGroup(group2);
        stream.addGroup(group3);
        stream.addGroup(group4);
        stream.addGroup(group5);
        stream.addGroup(group6);

        stream.printAllGroup();
        StreamServis streamServis = new StreamServis();
        streamServis.SortGrups(stream.groups);
        stream.printAllGroup();
    }
}
