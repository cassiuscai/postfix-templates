package postfix.templates;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TemplatesTest {

    @Test
    public void testFastJSONTemplates() {
        Person p1 = new Person();
        p1.setAge(8);
        p1.setName("Tommy");
        Person p2 = new Person();
        p2.setAge(8);
        p2.setName("Jerry");
        List<Person> ps = new ArrayList<Person>();
        ps.add(p1);
        ps.add(p2);
        // toJSONString
        String jsonString = JSON.toJSONString(p1);
        String jsonArray = JSON.toJSONString(ps);
        Assertions.assertThat((JSONObject) JSON.toJSON(p1)).isInstanceOf(JSONObject.class);
        Assertions.assertThat((JSONArray) JSON.toJSON(ps)).isInstanceOf(JSONArray.class);
        Assertions.assertThat(JSON.parseObject(jsonString)).hasSize(2).containsKeys("name", "age");
        Assertions.assertThat(JSON.parseObject(jsonString, Person.class).getName()).isEqualTo("Tommy");
        Assertions.assertThat(JSON.parseArray(jsonArray, Person.class)).hasSize(2);
        Assertions.assertThat(JSON.parseArray(jsonArray)).hasSize(2);
        Assertions.assertThat(JSON.isValidArray(jsonString)).isFalse();
        Assertions.assertThat(JSON.isValid(jsonString)).isTrue();
        Assertions.assertThat(JSON.isValidObject(jsonString)).isTrue();
        Assertions.assertThat(JSON.isValidObject(jsonArray)).isFalse();
        Assertions.assertThat(JSON.isValid(jsonArray)).isTrue();
        Assertions.assertThat(JSON.isValidArray(jsonArray)).isTrue();

        Assertions.assertThat(1).isPositive();
        Assertions.assertThat(1.0).isGreaterThan(0);

        Assertions.assertThat(new String[]{"a", "b"}).contains("a").contains("b").hasSize(2);

    }


}
