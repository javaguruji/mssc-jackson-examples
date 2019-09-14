package guru.springfw.msscjacksonexamples.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @author badrikant.soni
 */
public class TestBase {

    BeerDto getDto() {
        return BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("ALE")
                .id(UUID.randomUUID())
                .price(new BigDecimal("12.89"))
                .upc(123123123123L)
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .build();
    }
}
