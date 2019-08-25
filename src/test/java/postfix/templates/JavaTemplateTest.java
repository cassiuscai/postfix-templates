package postfix.templates;

import com.google.common.collect.Lists;
import org.testng.annotations.Test;

import java.util.List;

import static io.vavr.collection.List.of;
import static io.vavr.collection.List.ofAll;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Templates test.
 */
public class JavaTemplateTest {

    /**
     * Test generate template.
     */
    @Test
    public void testGenerateTemplate() {
        List<Integer> javaList = Lists.newArrayList(1, 2, 3, 4, 5);
        ofAll(javaList)
                .map(it -> it * 2)
                .filter(it -> it % 2 == 0);

        ofAll(javaList.stream()).map(i->i);


        final Integer[] ints = new Integer[]{1, 2, 3};
        assertThat(of(ints).size()).isEqualTo(3);

    }
}
