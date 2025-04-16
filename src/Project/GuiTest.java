package Project;
import javax.swing.*;
public class GuiTest {
    public static void main(String[] args) {
        String fullName = JOptionPane.showInputDialog("Атыңызды жана фамилияңызды жазыңыз:");

        String[] questions = {
                "1. Java кайсы программалоо тилине кирет?\nA) Интерпреттелген\nB) Компиляцияланган\nC) Экиөөнүн тең\nD) Скрипт тили",
                "2. Javaда кантип классты аныктайбыз?\nA) function MyClass\nB) class MyClass\nC) def MyClass\nD) struct MyClass",
                "3. Javaда массивди кантип жаратабыз?\nA) int arr[] = new int[5];\nB) array arr[5];\nC) int arr[5];\nD) list arr = new list();",
                "4. 'public static void main(String[] args)' деген эмне?\nA) Метод\nB) Класс\nC) Интерфейс\nD) Түзмөк",
                "5. Javaда мурастоо үчүн кайсы ачкыч сөз колдонулат?\nA) this\nB) super\nC) extends\nD) implements",
                "6. Javaда интерфейс деген эмне?\nA) Объект\nB) Методу жок класс\nC) Өзгөрмө\nD) Массив түрү",
                "7. Javaда try-catch эмне үчүн колдонулат?\nA) Цикл жазуу үчүн\nB) Объект түзүү үчүн\nC) Ката кармоо үчүн\nD) Массивди кайтаруу үчүн",
                "8. Javaда 'this' деген эмне билдирет?\nA) Тышкы объект\nB) Учурдагы объект\nC) Интерфейс\nD) Массив",
                "9. Javaда кайсы коллекция уникалдуу маанилерди сактайт?\nA) ArrayList\nB) HashSet\nC) LinkedList\nD) Queue",
                "10. Javaда кайсы модификатор эң катуу?\nA) public\nB) protected\nC) private\nD) default"
        };
        String[] correctAnswers = {"C", "B", "A", "A", "C", "B", "C", "B", "B", "C"};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            String answer = JOptionPane.showInputDialog(null, questions[i],
                    "Суроо " + (i+1), JOptionPane.QUESTION_MESSAGE);

            if (answer != null && answer.trim().equalsIgnoreCase(correctAnswers[i])) {
                score += 6;
            }
        }
        // Баа эсептөө
        String grade;
        if (score < 10) {
            grade = "Сиз тесттен өтпөдүңүз.";
        } else if (score < 30) {
            grade = "Баа: 3";
        } else if (score < 60) {
            grade = "Баа: 4";
        } else {
            grade = "Баа: 5";
        }
        // Жыйынтык терезеде көрсөтүлөт
        String message = "Аты-жөнү: " + fullName +
                "\nЖалпы упай: " + score +
                "\n" + grade;
        JOptionPane.showMessageDialog(null, message, "Жыйынтык", JOptionPane.INFORMATION_MESSAGE);
    }
}
