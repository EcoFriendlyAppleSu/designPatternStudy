package templatePattern.duck;

public class Duck implements Comparable<Duck>{

    public String name;
    public int weight;

    public Duck(String name, int age) {
        this.name = name;
        this.weight = age;
    }

    @Override
    public String toString() {
        return this.name + " 체중: " + weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // comparable comparator
    @Override
    public int compareTo(Duck otherDuck) {

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
