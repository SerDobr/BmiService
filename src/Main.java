public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 186; // рост см
        double weight = 75; // вес кг
        double bodymassindex = service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела = " + bodymassindex + ", ознакомьтесь с результатами ниже:");

        System.out.println("16 менне   - Выраженый деффецит массы");
        System.out.println("16-18.5    - Недостаточная масса тела");
        System.out.println("18.5-25    - Норма");
        System.out.println("25-30      - Избыточная масса тела (предожирение)");
        System.out.println("30-35      - Ожирение первой степени");
        System.out.println("35-40      - Ожирение второй степени");
        System.out.println("40 и более - Ожирение первой степени (морбидное)");

    }
}


