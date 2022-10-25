public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (this.name.length() < 3 || this.name.length() >= 19) {
            return false;
        } else if (this.name.contains(" ")) {
            if (this.name.startsWith(" ") || this.name.endsWith(" ")) {
                return false;
            }else if (this.name.indexOf(" ") == this.name.lastIndexOf(" ")){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + this.name + '\'' +
                '}';
    }
}