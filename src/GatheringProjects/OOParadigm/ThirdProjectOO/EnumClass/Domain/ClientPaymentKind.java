package GatheringProjects.OOParadigm.ThirdProjectOO.EnumClass.Domain;

public enum ClientPaymentKind {
    CREDITO{
        @Override
        public double calcularDesconto(double value){
            return value * 0.05;
        }

    },
    DEBITO{
        @Override
        public double calcularDesconto(double value){
           return value * 0.1;
        }
    };

    public double calcularDesconto(double value){
        return 0;
    }
}
