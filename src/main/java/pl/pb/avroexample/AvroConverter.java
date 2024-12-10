package pl.pb.avroexample;

import org.apache.avro.Protocol;
import org.apache.avro.Schema;
import org.apache.avro.compiler.idl.Idl;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AvroConverter {

    public static void main(String[] args) throws Exception {
        String fileName = "AnnotationProtocol";
        String namespaces = "annotation";
        Path projectPath = Paths.get("").toAbsolutePath();
        String basePath = String.format("%s/src/main/avro/%s/", projectPath, namespaces);
        Protocol protocol = getAvdlSchema(basePath, fileName);

        saveAvprSchema(protocol, basePath, fileName);
        saveAvscSchema(protocol, basePath);

        System.out.println("Conversion has been successfully finished !!!");
    }

    private static Protocol getAvdlSchema(String basePath, String fileName) {
        String avdlPath = basePath + fileName + ".avdl";
        try (Idl idlParser = new Idl(new FileReader(avdlPath))) {
            return idlParser.CompilationUnit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void saveAvprSchema(Protocol protocol, String basePath, String fileName) {
        String avprPath = basePath + fileName + ".avpr";

        try (FileWriter avprWriter = new FileWriter(new File(avprPath))) {
            avprWriter.write(protocol.toString(true).replace("avdl", "avpr")); // true dla formatu JSON z wcięciami
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void saveAvscSchema(Protocol protocol, String basePath) {
        String avscDirectory = basePath + "avsc/";
        for (Schema schema : protocol.getTypes()) {
            File avscFile = new File(avscDirectory, schema.getName() + ".avsc");
            try (FileWriter avscWriter = new FileWriter(avscFile)) {
                avscWriter.write(schema.toString(true).replace("avdl", "avsc")); // true dla formatu JSON z wcięciami
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
