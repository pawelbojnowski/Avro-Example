package pl.pb.avroexample;

import pl.pb.avroexample.annotation.AliasAnnotationExamples;
import pl.pb.avroexample.annotation.JavaClassAnnotationExamples;
import pl.pb.avroexample.annotation.NamespacesAnnotationExamples;
import pl.pb.avroexample.annotation.OrderAnnotationExamples;
import pl.pb.avroexample.basic.BasicExamples;
import pl.pb.avroexample.errormessage.ErrorMessageExamples;
import pl.pb.avroexample.fields.FieldsExamples;
import pl.pb.avroexample.loadcontracts.CreateProtocolProgramicaly;
import pl.pb.avroexample.loadcontracts.LoadSchemaAvdlProtocol;
import pl.pb.avroexample.loadcontracts.LoadSchemaAvprProtocol;
import pl.pb.avroexample.loadcontracts.LoadSchemaAvscProtocol;
import pl.pb.avroexample.rpcmessage.AvdlRpcMessageExamples;
import pl.pb.avroexample.rpcmessage.AvprRpcMessageExamples;
import pl.pb.avroexample.types.ComplexTypesTypesExamples;
import pl.pb.avroexample.types.LogicalAsRawTypesExamples;
import pl.pb.avroexample.types.LogicalTypesExamples;
import pl.pb.avroexample.types.PrimitiveTypesExamples;

public class Main {
    public static void main(String[] args) {
        //Basic example of avro contract
        runExamples(BasicExamples.class, () -> BasicExamples.main(args));

        // Types
        runExamples(PrimitiveTypesExamples.class, () -> PrimitiveTypesExamples.main(args));
        runExamples(LogicalTypesExamples.class, () -> LogicalTypesExamples.main(args));
        runExamples(LogicalAsRawTypesExamples.class, () -> LogicalAsRawTypesExamples.main(args));
        runExamples(ComplexTypesTypesExamples.class, () -> ComplexTypesTypesExamples.main(args));

        // Fields
        runExamples(FieldsExamples.class, () -> FieldsExamples.main(args));

        // RPC messages
        runExamples(AvprRpcMessageExamples.class, () -> AvprRpcMessageExamples.main(args));
        runExamples(AvdlRpcMessageExamples.class, () -> AvdlRpcMessageExamples.main(args));

        // Annotation
        runExamples(AliasAnnotationExamples.class, () -> AliasAnnotationExamples.main(args));
        runExamples(JavaClassAnnotationExamples.class, () -> JavaClassAnnotationExamples.main(args));
        runExamples(NamespacesAnnotationExamples.class, () -> NamespacesAnnotationExamples.main(args));
        runExamples(OrderAnnotationExamples.class, () -> OrderAnnotationExamples.main(args));

        // Error contract
        runExamples(ErrorMessageExamples.class, () -> ErrorMessageExamples.main(args));

        // Lading contract to schema or protocol fom file
        runExamples(CreateProtocolProgramicaly.class, () -> CreateProtocolProgramicaly.main(args));
        runExamples(LoadSchemaAvdlProtocol.class, () -> LoadSchemaAvdlProtocol.main(args));
        runExamples(LoadSchemaAvprProtocol.class, () -> LoadSchemaAvprProtocol.main(args));
        runExamples(LoadSchemaAvscProtocol.class, () -> LoadSchemaAvscProtocol.main(args));
    }

    private static void runExamples(Class<?> basicExamplesClass, Runnable runnable) {
        String simpleName = basicExamplesClass.getSimpleName();
        System.out.println(String.format("%n---------------------------------------- %s ----------------------------------------", simpleName));
        runnable.run();
        System.out.println(String.format("-----------------------------------------%s-----------------------------------------", simpleName.replaceAll(".", "-")));
    }
}