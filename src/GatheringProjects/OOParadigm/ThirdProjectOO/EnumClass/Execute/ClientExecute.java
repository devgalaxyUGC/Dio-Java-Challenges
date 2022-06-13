package GatheringProjects.OOParadigm.ThirdProjectOO.EnumClass.Execute;

import GatheringProjects.OOParadigm.ThirdProjectOO.EnumClass.Domain.Client;
import GatheringProjects.OOParadigm.ThirdProjectOO.EnumClass.Domain.ClientPaymentKind;
import GatheringProjects.OOParadigm.ThirdProjectOO.EnumClass.Domain.ClienteTypesEnum;

public class ClientExecute {
    public static void main(String[] args) {
        // Client client1 = new Client("Belchior", "Pessoa Física");
        // Looking forward a standard of names and description, we can create a enum class
        // that works like a static class, so we can limit the data entrance when we're
        // describing something with a constructor class
        Client client1 = new Client("Belchior", ClienteTypesEnum.PESSOA_FISICA, ClientPaymentKind.DEBITO);
        Client client2 = new Client("Martin", ClienteTypesEnum.PESSOA_JURIDICA, ClientPaymentKind.CREDITO);
        Client client3 = new Client("Angelo", ClienteTypesEnum.PESSOA_FISICA, ClientPaymentKind.DEBITO);
        // Now, I'm working with the particular method in ClientPaymentKind Class
        System.out.println(ClientPaymentKind.CREDITO.calcularDesconto(20));
        System.out.println(ClienteTypesEnum.checkTitleResume("My History"));
        System.out.println(ClienteTypesEnum.checkTitleResume("My Desire"));
    }
}
