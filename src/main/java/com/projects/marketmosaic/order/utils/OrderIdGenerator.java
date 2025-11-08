package com.projects.marketmosaic.order.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class OrderIdGenerator {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final String PREFIX = "ORD-";
    private static final Random RANDOM = new Random();

    public static String generateOrderId() {
        String datePart = LocalDateTime.now().format(DATE_FORMATTER);
        String randomPart = generateRandomAlphaNumeric();
        String uuidPart = UUID.randomUUID().toString().toUpperCase();

        // Combine all parts
        String fullId = PREFIX + datePart + "-" + randomPart + uuidPart;

        if (fullId.length() > 50) {
            fullId = fullId.substring(0, 50);
        }

        return fullId;

    }

    private static String generateRandomAlphaNumeric() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(chars.charAt(RANDOM.nextInt(chars.length())));
        }
        return sb.toString();
    }

}
