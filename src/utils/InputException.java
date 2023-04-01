package utils;

public class InputException extends RuntimeException{
    private InputException(String message) {
        super(message);
    }

    public static void CreateInputException(String index){
        switch (index) {
            case "4001":
                throw new InputException("Введена пустая строка.");
            case "4002":
                throw new InputException("\n" + "Введена неверная информация.");
            case "4003":
                throw new InputException("\n" + "Некорректный формат даты рождения.");
            case "4005":
                throw new InputException("Некорректно указано значение указание пола.");
            case "4007":
                throw new InputException("\n" + "Неверный формат номера телефона");
        }
    }
}