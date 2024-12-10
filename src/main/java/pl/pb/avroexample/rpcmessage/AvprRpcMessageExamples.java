package pl.pb.avroexample.rpcmessage;

import org.apache.avro.ipc.Callback;

import java.io.IOException;

public class AvprRpcMessageExamples {

    private static final pl.pb.avroexample.rpcmessages.avdl.RpcMessageData.Callback rpcMessageDataAvdl = new pl.pb.avroexample.rpcmessages.avdl.RpcMessageData.Callback() {

        @Override
        public void logMessage(CharSequence message) {
            System.out.println(message);
        }

        @Override
        public int add(int foo, int bar) {
            return foo + bar;
        }

        @Override
        public void throwError() throws pl.pb.avroexample.rpcmessages.avdl.Error {
            throw new pl.pb.avroexample.rpcmessages.avdl.Error();
        }

        @Override
        public void runAndForget(CharSequence message) {
            System.out.println("run: runAndForget");
        }

        @Override
        public void logMessage(CharSequence message, org.apache.avro.ipc.Callback<Void> callback) throws IOException {
            System.out.println(message);
            callback.handleResult(null);
        }

        @Override
        public void add(int foo, int bar, org.apache.avro.ipc.Callback<Integer> callback) {
            callback.handleResult(foo + bar);
        }

        @Override
        public void throwError(org.apache.avro.ipc.Callback<Void> callback) {
            callback.handleError(new pl.pb.avroexample.rpcmessages.avdl.Error());
        }
    };

    public static void main(String[] args) {
        try {
            /**
             * OUTPUT:
             * pl.pb.avroexample.rpcmessages.avdl.Error
             * add() handleResult: 3
             * Hello World
             * logMessage() handleResult: null
             * throwError() handleError: pl.pb.avroexample.rpcmessages.avdl.Error
             */
            System.out.println(rpcMessageDataAvdl.add(1, 2));
            rpcMessageDataAvdl.logMessage("Hello World");
            rpcMessageDataAvdl.runAndForget("Hello World");
            try {
                rpcMessageDataAvdl.throwError();
            } catch (pl.pb.avroexample.rpcmessages.avdl.Error e) {
                System.out.println(e);
            }

            // With callback
            rpcMessageDataAvdl.add(1, 2, new Callback<Integer>() {
                @Override
                public void handleResult(Integer result) {
                    System.out.println("add() handleResult: " + result);
                }

                @Override
                public void handleError(Throwable error) {
                    System.out.println("add() handleError: " + error);
                }
            });

            rpcMessageDataAvdl.logMessage("Hello World", new Callback<Void>() {
                @Override
                public void handleResult(Void result) {
                    System.out.println("logMessage() handleResult: " + result);
                }

                @Override
                public void handleError(Throwable error) {
                    System.out.println("logMessage() handleError: " + error);
                }
            });

            rpcMessageDataAvdl.throwError(new Callback<Void>() {
                @Override
                public void handleResult(Void result) {
                    System.out.println("throwError() handleResult: " + result);
                }

                @Override
                public void handleError(Throwable error) {
                    System.out.println("throwError() handleError: " + error);
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}