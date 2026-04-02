package pl.javastart;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Junit5Assertions {

    private final Map<String, Code> codes = new HashMap<>();

    boolean isPrimeNumber(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    Code getCode(String key) {
        if (!codes.containsKey(key)) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String codeValue = UUID.randomUUID().toString();
            Code code = new Code(key, codeValue, System.currentTimeMillis());
            codes.put(key, code);
            return code;
        } else {
            return codes.get(key);
        }
    }

    static class Code {
        private String key;
        private String code;
        private Long createdAt;

        public Code(String key, String code, Long createdAt) {
            this.key = key;
            this.code = code;
            this.createdAt = createdAt;
        }

        public String getKey() {
            return key;
        }

        public String getCode() {
            return code;
        }

        public Long getCreatedAt() {
            return createdAt;
        }
    }
}
