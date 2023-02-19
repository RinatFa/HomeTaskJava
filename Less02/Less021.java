// Задача1.	Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
// "city":"Moscow", "age":"null"}

import java.util.LinkedHashMap;
import java.util.Map;

public class Less021 {
    public static void main(String[] args) {
        String sSql = "SELECT * FROM students WHERE ";
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", null);
        System.out.println();
        System.out.println(sSql + getQuery(map) + '\n');
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder WHERE = new StringBuilder();
        for (Map.Entry<String, String> p: params.entrySet()) {
            if (p.getValue() != null) {
                WHERE.append(p.getKey() + " = " + "'" +
                  p.getValue() + "'" + " AND ");
            }
        }
        WHERE.delete(WHERE.length()-4, WHERE.length());
        return WHERE.toString();
    }
}
