package postfix.templates;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.mockito.stubbing.Answer;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class TemplatesTest {


    @Test
    public void testFastJSONTemplates() {

        Person p1 = new Person();
        p1.setAge(8);
        p1.setName("Tommy");
        Person p2 = new Person();
        p2.setAge(8);
        p2.setName("Jerry");
        List<Person> ps = new ArrayList<>();
        ps.add(p1);
        ps.add(p2);
        // toJSONString
        String jsonString = JSON.toJSONString(p1);
        String jsonArray = JSON.toJSONString(ps);
        assertThat((JSONObject) JSON.toJSON(p1)).isInstanceOf(JSONObject.class);
        assertThat((JSONArray) JSON.toJSON(ps)).isInstanceOf(JSONArray.class);
        assertThat(JSON.parseObject(jsonString)).hasSize(2).containsKeys("name", "age");
        assertThat(JSON.parseObject(jsonString, Person.class).getName()).isEqualTo("Tommy");
        assertThat(JSON.parseArray(jsonArray, Person.class)).hasSize(2);
        assertThat(JSON.parseArray(jsonArray)).hasSize(2);
        assertThat(JSON.isValidArray(jsonString)).isFalse();
        assertThat(JSON.isValid(jsonString)).isTrue();
        assertThat(JSON.isValidObject(jsonString)).isTrue();
        assertThat(JSON.isValidObject(jsonArray)).isFalse();
        assertThat(JSON.isValid(jsonArray)).isTrue();
        assertThat(JSON.isValidArray(jsonArray)).isTrue();

        assertThat(1).isPositive();
        assertThat(1.0).isGreaterThan(0);

        assertThat(new String[]{"a", "b"}).contains("a").contains("b").hasSize(2);

        Service service1 = mock(Service.class, (Answer<Integer>) invocation -> {
            return 100;
        });

        Service service2 = spy(service1);
        when(service2.count()).thenReturn(100).thenReturn(200);
        assertThat(service2.count()).isEqualTo(100);
        assertThat(service2.count()).isEqualTo(200);
        reset(service2);

        assertThat(service2.count()).isEqualTo(100);


        doReturn(101).when(service2).count();
        assertThat(service2.count()).isEqualTo(101);

        assertThat(ps.toArray(new Person[0])).hasSize(2);

    }
}
