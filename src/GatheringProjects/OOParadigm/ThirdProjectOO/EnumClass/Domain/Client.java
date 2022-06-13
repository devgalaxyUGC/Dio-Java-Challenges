package GatheringProjects.OOParadigm.ThirdProjectOO.EnumClass.Domain;

public class Client {
    private String Name;
    private ClienteTypesEnum TipoDeCliente;
    private ClientPaymentKind TipoDePagamento;

    // I created two constructors: One with "TiposDeCliente" working with an enum class
    // like I described in ClientExecute and the second one working with String. More
    // description in ClientExecute class

    public Client(String name, ClienteTypesEnum tipoDeCliente, ClientPaymentKind TipoDePagamento) {
        this.Name = name;
        this.TipoDeCliente = tipoDeCliente;
        this.TipoDePagamento = TipoDePagamento;
    }

/* public Client(String name, String tipoDeCliente) {
        Name = name;
        TipoDeCliente = tipoDeCliente;
    }
    */

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ClienteTypesEnum getTipoDeCliente() {
        return TipoDeCliente;
    }

    public ClientPaymentKind getTipoDePagamento() {
        return TipoDePagamento;
    }

    /*public String getTipoDeCliente() {
        return TipoDeCliente;
    }

    public void setTipoDeCliente(String tipoDeCliente) {
        TipoDeCliente = tipoDeCliente;
    }
    */
}
