package com.jagex;

public final class Class174 {
    static void method1186() {
        Client.packet.writeHeader(128);

        for (InterfaceNode var0 = Client.interfaceNodes.first(); var0 != null; var0 = Client.interfaceNodes.next()) {
            if (var0.state == 0 || var0.state == 3) {
                InterfaceNode.method216(var0, true);
            }
        }

        if (Client.anInterfaceComponent1627 != null) {
            ItemTable.method284(Client.anInterfaceComponent1627);
            Client.anInterfaceComponent1627 = null;
        }

    }
}
