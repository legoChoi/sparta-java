package lecture.src.week03.ex02;

public class YalcoChicken {
    static String brand = "얄코 치킨";

    static String context() {
        return "%s 입니다. 무엇을 도와들릴까요?".formatted(brand);
    }

    private static int lastNo = 0;
    private int no = ++lastNo;
    private String name;

    public YalcoChicken(String name) {
        this.name = name;
    }

    public String intro () {
        return "안녕하세요. %s %d호 %s호점입니다."
                .formatted(brand, no, name);
    }
}
