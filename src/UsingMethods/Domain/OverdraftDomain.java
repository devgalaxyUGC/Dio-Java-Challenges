package UsingMethods.Domain;

public class OverdraftDomain {
        private double accountBalance;
        private double overdraftValue;
        private double overdraftPayment;

        public OverdraftDomain(double accountBalance) {
            this.accountBalance = accountBalance;
        }

        public double overdraftExecution(double overdraftValue) {
            this.overdraftValue = overdraftValue;
            accountBalance = accountBalance + overdraftValue;
            taxExecution();
            return accountBalance;
        }

        private void taxExecution(){
            System.out.println("You required a overdraft of "+overdraftValue);
            overdraftPayment = overdraftValue * 1.150;
            System.out.println("To pay this overdraft, you'll need to pay "+overdraftPayment);
        }

        public void printAccount() {
            System.out.println("Your current account balance is "+getAccountBalance());
        }

        public double getAccountBalance() {
            return accountBalance;
        }
    }


