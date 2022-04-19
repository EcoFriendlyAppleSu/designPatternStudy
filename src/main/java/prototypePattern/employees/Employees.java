package prototypePattern.employees;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> emList;

    public Employees() {
        emList = new ArrayList<String>();
    }

    public Employees(List<String> emList) {
        this.emList = emList;
    }

    public void loadData() {
        this.emList.add("lee");
        this.emList.add("kim");
        this.emList.add("park");
        this.emList.add("choi");
    }

    public List<String> getEmList() {
        return this.emList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s :
                this.emList) {
            temp.add(s);
        }
        return new Employees(temp);
    }

}
