package lecture.section01.logical;

public class Application {

    public static void main(String[] args) {

        System.out.println("===================================");
        //평균 80점이상, 출석률이 90%이상이고 징계이력이 없어야 장학금 대상이다.
        // 아해 조건의 학생은 장학금 대상인가?

        int average = 88;
        int attendanceRate = 95;
        boolean hasRecord = false;

        boolean result2 = average >= 80
                && attendanceRate >= 90
        && !hasRecord;
        System.out.println("result = +result2");
    }
}
