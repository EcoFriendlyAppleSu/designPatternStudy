package templatePattern;

import templatePattern.bevarge.CaffeineBeverage;
import templatePattern.bevarge.Coffee;
import templatePattern.bevarge.Tea;

public class Client {
    public static void main(String[] args) {

        /*
        * 부모 객체로 upcasting을 진행했을 때 부모객체의 참조 변수가
        * 객체화된 인스턴스를 가리킬 수 있다.
        * ex) coffee.getName은 사용할 수 없다. -> 부모가 정보를 갖고 있지 않기 때문에
        * */
        // CaffeineBeverage coffee = new Coffee();
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println("--------tea 준비중----------");
        tea.prepareBeverage();
        System.out.println("--------coffee 준비중----------");
        coffee.prepareBeverage();
    }
}
