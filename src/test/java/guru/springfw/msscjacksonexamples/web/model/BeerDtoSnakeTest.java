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
@ActiveProfiles("snake")
public class BeerDtoSnakeTest extends TestBase {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSnake() throws JsonProcessingException {

        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);

        // snake case
        // {"id":"c1fcaffb-7021-4518-a329-c6fb7d9d9c92","beer_name":"BeerName","beer_style":"ALE","upc":123123123123,"price":12.89,"created_date":"2019-09-14T20:47:39.481396+05:30","last_updated_date":"2019-09-14T20:47:39.481492+05:30"}

        // normal case
        // {"id":"54eb8d18-6dea-4225-ab1c-a0822905e2a9","beerName":"BeerName","beerStyle":"ALE","upc":123123123123,"price":12.89,"createdDate":"2019-09-14T20:48:30.439186+05:30","lastUpdatedDate":"2019-09-14T20:48:30.439298+05:30"}

    }
}
