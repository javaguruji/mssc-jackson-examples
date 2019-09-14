package guru.springfw.msscjacksonexamples.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

/**
 * @author badrikant.soni
 */
@JsonTest
class BeerDtoTest extends TestBase {

    @Autowired
    ObjectMapper objectMapper;


    @Test
    void testSerializeDto() throws JsonProcessingException {

        // serialization => convert java object to json
        BeerDto beerDto = getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);

    }

    @Test
    void testDeserialize() throws IOException {

        // deserialization => convert json object to java object
        String json = "{\"beerId\":\"57cb0404-35fc-4c5c-8eb1-d9b014b0396d\",\"beerName\":\"BeerName\",\"beerStyle\":\"ALE\",\"upc\":123123123123,\"price\":12.89,\"createdDate\":\"2019-09-14T20:30:41.809951+05:30\",\"lastUpdatedDate\":\"2019-09-14T20:30:41.810052+05:30\"}\n";
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);

    }
}