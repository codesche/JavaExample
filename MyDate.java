
// 날짜를 구현한 클래스 MyDate가 있다.
// 날짜가 같으면 equals() 메서드의 결과가 true가 되도록 구현
// hashCode() 메서드도 구현

class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return day + month + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyDate) {
            MyDate date = (MyDate) obj;
            return (this.day == date.day);
        }

        return false;
    }


}

public class MyDateTest {
    public static void main(String[] args) {

        MyDate date1 = new MyDate(22, 7, 2022);
        MyDate date2 = new MyDate(22, 7, 2022);

        System.out.println(date1.equals(date2));

        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());

    }
}

/**
 *  1. MyDate 클래스에 날짜를 구현할 수 있도록 변수와 생성자를 입력
 *  2. equals()를 재정의하여 2개의 date가 날짜가 같을 경우 equals를 true로 반환하도록 재정의한다
 *  3. hashCode()를 재정의하여 day + month + year의 값을 return하게 한다
 *  4. MyDate 인스턴스 date1과 date2를 생성하고 equals를 하면 true가 반환되고 hashcode()를 사용하면
 *  day, month, year를 합한 값이 출력된다.
 */

