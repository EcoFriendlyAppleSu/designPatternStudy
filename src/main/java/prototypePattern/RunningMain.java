package prototypePattern;

import prototypePattern.employees.Employees;

import java.util.List;

/**
 * prototype pattern
 * 1. 생성 패턴의 한 종류이며 어떤 Concrete Class를 사용하는지에 대한 정보를 캡슐화합니다.
 * 2. 인스턴스 생성 부분을 완전히 가리고 어떻게 결합하는지에 대한 부분을 완전히 가려줍니다.
 *
 * Ex) new 생성자 키워드를 통해 항상 DB의 모든 데이터들을 가져오는 것은 좋은 아이디어가 아니다.
 * 한 번 데이터를 불러온 후, 새로운 객체에 복사하여 사용하는 것이 더 효율적이다.
 *
 * 객체를 복사하는 것이 네트워크 접근이나 DB 접근보다 비용이 훨씬 적게든다.
 */
public class RunningMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees emp1 = (Employees) employees.clone();
        Employees emp2 = (Employees) employees.clone();
        List<String> emList = emp1.getEmList();
        emList.add("john");
        List<String> emList1 = emp2.getEmList();
        emList1.remove("park");

        System.out.println("employees = " + employees);
        System.out.println("emList = " + emList);
        System.out.println("emList1 = " + emList1);
    }
}
