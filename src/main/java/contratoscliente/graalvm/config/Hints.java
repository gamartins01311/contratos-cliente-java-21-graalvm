package contratoscliente.graalvm.config;

import org.hibernate.internal.EntityManagerMessageLogger;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;

public class Hints implements RuntimeHintsRegistrar {
    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        hints.reflection().registerType(TypeReference.of(EntityManagerMessageLogger.class),
                builder -> builder.withMembers());
    }
}
