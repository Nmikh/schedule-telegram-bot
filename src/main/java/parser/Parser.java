package parser;

import com.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.models.Day;
import com.models.Lesson;

import java.io.File;
import java.io.IOException;


public class Parser {
    private final static String PATH = "C:\\\\Users\\\\user\\\\Desktop\\\\schedule-telegram-bot\\\\src\\\\main\\\\resources\\\\";


    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

//        Lesson lessonFirst = new Lesson();
//        lessonFirst.setName("Компонентно-оріентоване програмування");
//        lessonFirst.setClassRoom("505ф");
//        lessonFirst.setLecturer("Прігожев О. С.");
//        lessonFirst.setType("лекція");
//        lessonFirst.setStatus("Полезность == 0. Лучше поспи, а то он несет полную дичь");
//
//        Lesson lessonSecond = new Lesson();
//        lessonSecond.setName("БЖД, основи екології та охорони праці");
//        lessonSecond.setClassRoom("27фіз");
//        lessonSecond.setLecturer("Москалюк А. Ю.");
//        lessonSecond.setType("лекція");
//        lessonSecond.setStatus("Можно сходить. Намного полезнее, чем пара до этого");
//
//        Lesson lessonThird = new Lesson();
//        lessonThird.setName("Компонентно -оріентоване програмування");
//        lessonThird.setClassRoom("");
//        lessonThird.setLecturer("Прігожев О.С/Паулін О.М");
//        lessonThird.setType("лаб");
//        lessonThird.setStatus("Эх.. и снова этот пиздабол.. их еще и 2-е");
//
//        Day monday = new Day();
//        monday.setName(Constants.MONDAY);
//        monday.setFirstLesson(lessonFirst);
//        monday.setSecondLesson(lessonSecond);
//        monday.setThirdLesson(lessonThird);
//
//        mapper.writeValue(new File(PATH + Constants.MONDAY + ".json"), monday);

//        Lesson lessonFirst = new Lesson();
//        lessonFirst.setName("Інтелектуальний аналіз даних");
//        lessonFirst.setClassRoom("908ф");
//        lessonFirst.setLecturer("Городнича К.О.");
//        lessonFirst.setType("лаб");
//        lessonFirst.setStatus("Можно спокойно сдавать. Да и вечный ПМС у нее закончился, пока что ..");
//
//        Lesson lessonSecond = new Lesson();
//        lessonSecond.setName("Проектний практикум");
//        lessonSecond.setClassRoom("305ф");
//        lessonSecond.setLecturer("Блажко О. А.");
//        lessonSecond.setType("прак");
//        lessonSecond.setStatus("На любителя. Если любишь поговорить о своем дипломе (который конечно же ты \"сделал\") при всех, то вперед");
//
//        Lesson lessonThird = new Lesson();
//        lessonThird.setName("Проектний практикум");
//        lessonThird.setClassRoom("307ф");
//        lessonThird.setLecturer("Блажко О. А.");
//        lessonThird.setType("лекція");
//        lessonThird.setStatus("Смотри выше");
//
//        Day tuesday = new Day();
//        tuesday.setName(Constants.TUESDAY);
//        tuesday.setFirstLesson(lessonFirst);
//        tuesday.setSecondLesson(lessonSecond);
//        tuesday.setThirdLesson(lessonThird);
//
//        mapper.writeValue(new File(PATH + Constants.TUESDAY + ".json"), tuesday);

//        Lesson lessonFirst = new Lesson();
//        lessonFirst.setName("ПЗ вбудованих систем ");
//        lessonFirst.setClassRoom("308ф");
//        lessonFirst.setLecturer("Сінегуб М. І.");
//        lessonFirst.setType("лекція");
//        lessonFirst.setStatus("Это ложь. У тебя нет первой пары. Спи дальше. И не обижай его, он сам в шоке от происходящего");
//
//        Lesson lessonSecond = new Lesson();
//        lessonSecond.setName("Інтелектуальний аналіз даних");
//        lessonSecond.setClassRoom("308ф");
//        lessonSecond.setLecturer("Крісілов В. А");
//        lessonSecond.setType("лекція");
//        lessonSecond.setStatus("Лучше сходи. Хорошо ведет");
//
//        Day wednesday = new Day();
//        wednesday.setName(Constants.WEDNESDAY);
//        wednesday.setFirstLesson(lessonFirst);
//        wednesday.setSecondLesson(lessonSecond);
//
//        mapper.writeValue(new File(PATH + Constants.WEDNESDAY + ".json"), wednesday);

//        Lesson lessonSecond = new Lesson();
//        lessonSecond.setName("Компонентно -оріентована розробка ПЗ");
//        lessonSecond.setClassRoom("306ф");
//        lessonSecond.setLecturer("Прігожев О. С.");
//        lessonSecond.setType("лекція");
//        lessonSecond.setStatus("БЕГОМ! А то он не откроет лабы тебе!, которые он никому так и не откроет");
//
//        Lesson lessonThird = new Lesson();
//        lessonThird.setName("Інтелектуальний аналіз даних");
//        lessonThird.setClassRoom("306ф");
//        lessonThird.setLecturer(" Крісілов В. А.");
//        lessonThird.setType("лекція");
//        lessonThird.setStatus("Лучше сходи. Хорошо ведет");
//
//        Day thursday = new Day();
//        thursday.setName(Constants.THURSDAY);
//        thursday.setSecondLesson(lessonSecond);
//        thursday.setThirdLesson(lessonThird);
//
//        mapper.writeValue(new File(PATH + Constants.THURSDAY + ".json"), thursday);

        Lesson lessonFirst = new Lesson();
        lessonFirst.setName("ПЗ вбудованих систем ");
        lessonFirst.setClassRoom("806ф");
        lessonFirst.setLecturer("Сінегуб М.І");
        lessonFirst.setType("лаб");
        lessonFirst.setStatus("Сдай хоть что-то, он сам не знает, как это делать");

        Lesson lessonSecond = new Lesson();
        lessonSecond.setName("ПЗ вбудованих систем ");
        lessonSecond.setClassRoom("408ф");
        lessonSecond.setLecturer("Сінегуб М.І");
        lessonSecond.setType("лекція");
        lessonSecond.setStatus("Спи дальше. И не обижай его, он сам в шоке от происходящего");

        Lesson lessonThird = new Lesson();
        lessonThird.setName("Основи охорони праці");
        lessonThird.setClassRoom("28фіз");
        lessonThird.setLecturer("Чернега Ю.С.");
        lessonThird.setType("лаб");
        lessonThird.setStatus("Сдавать надо в любом случае, так что, не затягивай");

        Day friday = new Day();
        friday.setName(Constants.FRIDAY);
        friday.setFirstLesson(lessonFirst);
        friday.setSecondLesson(lessonSecond);
        friday.setThirdLesson(lessonThird);

        mapper.writeValue(new File(PATH + Constants.FRIDAY + ".json"), friday);
    }
}
