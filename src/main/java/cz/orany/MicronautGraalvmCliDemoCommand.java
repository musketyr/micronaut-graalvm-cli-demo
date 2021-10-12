package cz.orany;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.util.Arrays;

@Command(name = "micronaut-graalvm-cli-demo", description = "...", mixinStandardHelpOptions = true)
public class MicronautGraalvmCliDemoCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        System.out.print("Arguments: ");
        System.out.println(Arrays.toString(args));
        System.out.print("Environment Variables: ");
        System.getenv().forEach((k, v) -> System.out.printf("%20s: %100s%n", k, v));
        PicocliRunner.run(MicronautGraalvmCliDemoCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
