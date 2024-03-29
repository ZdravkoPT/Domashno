import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, file> fileActions = fileManage.createFileActions();
        menuChoice fileMenu = fileManage.createFileMenu(fileActions);

        Scanner input = new Scanner(System.in);
        do {
            System.out.print(":");
            String userChoice = input.nextLine();
            fileMenu.input(userChoice);
        } while (true);
    }
}






//Вашата  програма  трябва  да  позволява  на  потребителя да  отваря  файлове (open),
// да извършва върху тях някакви операции,
// след което да записва промените обратно в същия файл (save) или в друг,
// който потребителят посочи (save as).

// Трябва да има и опция за затваряне на файла, без записване на промените (close).
// За целта, когато програмата ви се стартира,
// тя трябва да позволява на потребителя да въвежда команди
// и след това да ги изпълнява.
// Когато отворите даден файл, неговото съдържание трябва да се зареди в паметта,
// след което файлът се затваря.

// Всички промени, които потребителят направи
// след това трябва да се пазят в паметта,
// но не трябва да се записват обратно,
// освен ако потребителят изрично не укаже това.

// Във всеки от проектите има посочен конкретен файлов формат,
// с който приложението ви трябва да работи.
// Това означава, че:
// 1.то трябва да може да чете произволен валиден файл от въпросния формат;
// 2.когато записва данните, то трябва да създава валидни файлове във въпросния формат.
// Както казахме по-горе, потребителят трябва да може да въвежда команди,
// чрез които да посочва какво трябва да се направи.
// Командите могат да имат нула, един или повече параметри,
// които се изреждат един след друг, разделени с интервали.
// Освен ако не е казано друго, всяка от командите извежда съобщение,
// от което да е ясно дали е успяла и какво е било направено.
// Дадените по-долу команди трябва да се поддържат от всеки от проектите.
// Под всяка от тях е даден пример за нейната работа:
// OpenЗарежда съдържанието на даден файл.
// Ако такъв не съществува се създава нов с празно съдържание.
// Всички останали команди могат да се изпълняват само ако има успешно зареден файл.
// След като файлът бъде отворен и се прочете,
// той се затваря и приложението ви вече не трябва да работи с негo,
// освен ако потребителят не поиска да запише обратно направените промени (вижте командата save по-долу),
// в който случай файлът трябва да се отвори наново.
// За целта трябва да изберете подходящо представяне на информацията от файла.
// Ако при зареждането на данните, приложението ви открие грешка,
// то трябва да изведе подходящо съобщение за грешка и да прекрати своето изпълнение.