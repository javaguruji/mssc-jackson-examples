package guru.springfw.msscjacksonexamples.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author badrikant.soni
 */
@JsonTest
@ActiveProfiles("kebab")
public class BeerDtoKebabTest extends TestBase {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testKebab() throws JsonProcessingException {

        BeerDto beerDto = getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);

        // o/p : {"id":"28991a02-2a32-4fb1-92d5-9ed8504bd3bf","beer-name":"BeerName","beer-style":"ALE","upc":123123123123,"price":12.89,"created-date":"2019-09-14T20:56:22.031308+05:30","last-updated-date":"2019-09-14T20:56:22.031383+05:30"}
    }
}
