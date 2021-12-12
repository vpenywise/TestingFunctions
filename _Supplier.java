package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getConnectionUrl());
        System.out.println(getConnectorUrlSupplier.get());
        System.out.println(getConnectorUrlSupplierList.get());

    }

    static String getConnectionUrl () {
        return "jdbc://locahost:5432/users";
    }

    static Supplier<String> getConnectorUrlSupplier = () -> "jdbc://locahost:5432/users";

    static Supplier<List<String>> getConnectorUrlSupplierList = () ->
            List.of("jdbc://locahost:5432/users",
                    "jdbc://locahost:5432/customer");
}
