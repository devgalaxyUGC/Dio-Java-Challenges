package GatheringProjects.OOParadigm.SecondProjectOO.OOElementsPartTwo.Execute;

import GatheringProjects.OOParadigm.SecondProjectOO.OOElementsPartTwo.Domain.Faxineiro;
import GatheringProjects.OOParadigm.SecondProjectOO.OOElementsPartTwo.Domain.Funcionario;
import GatheringProjects.OOParadigm.SecondProjectOO.OOElementsPartTwo.Domain.Gerente;
import GatheringProjects.OOParadigm.SecondProjectOO.OOElementsPartTwo.Domain.Vendedor;

public class CompanyExecute {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
        // Upcast

        Gerente gerenteNotWorking = (Gerente) new Funcionario();
        // Downcast with advice for possible ClassCastException,
    }
}
