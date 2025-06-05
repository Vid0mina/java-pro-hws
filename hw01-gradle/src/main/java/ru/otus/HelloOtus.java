package ru.otus;

import com.google.common.base.Splitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("java:S106")
public class HelloOtus {
    private static final Logger logger = LoggerFactory.getLogger(HelloOtus.class);

    public static void main(String... args) {
        String message =
                "добрый,,сострадательный, добродетельный великодушный, милосердный   ,,, сострадательный, кроткий,отзывчивый, добросердечный, , милостивый   , человеколюбивый,   человечный";
        Iterable<String> result =
                Splitter.on(',').trimResults().omitEmptyStrings().split(message);
        if (logger.isDebugEnabled()) {
            logger.info(result.toString());
        }
    }
}
