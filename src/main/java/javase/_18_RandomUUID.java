package javase;

import lombok.extern.log4j.Log4j2;

import java.util.UUID;

@Log4j2
public class _18_RandomUUID {
    public static void main(String[] args) {
        UUID uuid=UUID.randomUUID();
        System.out.println(uuid);
        log.info(uuid);
    }
}
