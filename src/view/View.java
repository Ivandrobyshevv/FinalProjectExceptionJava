package view;

public class View {
    public boolean printMessage(String mass) {
        switch (mass){
            case "0":
                System.out.println("Привет, если вы хотите выйти, пожалуйста, введите, введите: exit");
                return true;
            case "1":
                System.out.println("Пожалйста, введите: " +
                        "Имя Фамилия Отчество День_рождения(dd.mm.yyyy) Номер_телефона Пол(f/m)");
                return true;
            case "100":
                System.out.println("Корректная информация.");
                return true;
            default:
                System.out.println(mass);
                return false;
        }
    }
}
