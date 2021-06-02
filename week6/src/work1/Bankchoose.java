package work1;

import java.util.Scanner;
public class Bankchoose {
    private static Customer account = null;

    public static int menu() {
        int choose = 0;
        System.out.println("��ӭʹ������ϵͳ");
        System.out.println("1.����");
        System.out.println("2.���");
        System.out.println("3.ȡ��");
        System.out.println("4.����");
        System.out.println("5.����");
        System.out.println("6.���н���");
        System.out.println("7.��ѯ���");
        System.out.println("8.�˳�");
        System.out.println("��ѡ��1-8��: ");
        Scanner scan = new Scanner(System.in);
        choose = scan.nextInt();
        return choose;
    }

    public static int menu2() {
        int choose = 0;
        System.out.println("��ѡ�񿪿�����");
        System.out.println("1.���ÿ�checkingAccount");
        System.out.println("2.�洢��savingAccount");
        System.out.println("3.����exit");
        System.out.println("��ѡ��1-3����");
        Scanner scan = new Scanner(System.in);
        choose = scan.nextInt();
        return choose;
    }

    public static void createCheckingAccount() {
        System.out.print("������SSN: ");
        Scanner scan1 = new Scanner(System.in);
        String ssn = scan1.nextLine();
        System.out.print("����������: ");
        Scanner scan2 = new Scanner(System.in);
        String name = scan2.nextLine();
        System.out.print("�����뿨��: ");
        Scanner scan3 = new Scanner(System.in);
        String accountNum = scan3.nextLine();
        System.out.print("������������: ");
        Scanner scan4 = new Scanner(System.in);
        double serviceCharge = scan4.nextDouble();
        CheckingAccount cAccount = new CheckingAccount(accountNum, 0, serviceCharge);
        if (account == null) {
            account = new Customer(ssn, name, cAccount);
        } else {
            account.setSsn(ssn);
            account.setName(name);
            account.setCheckingAccount(cAccount);
        }
        System.out.println("�����ɹ���");
    }

    public static void createSavingsAccount() {
        System.out.print("������SSN: ");
        Scanner scan1 = new Scanner(System.in);
        String ssn = scan1.nextLine();
        System.out.print("����������: ");
        Scanner scan2 = new Scanner(System.in);
        String name = scan2.nextLine();
        System.out.print("�����뿨��: ");
        Scanner scan3 = new Scanner(System.in);
        String accountNum = scan3.nextLine();
        System.out.print("����������: ");
        Scanner scan4 = new Scanner(System.in);
        double interestRate = scan4.nextDouble();
        SavingsAccount sAccount = new SavingsAccount(accountNum, 0, interestRate);
        if (account == null) {
            account = new Customer(ssn, name, sAccount);
        } else {
            account.setSsn(ssn);
            account.setName(name);
            account.setSavingsAccount(sAccount);
        }

        System.out.println("�����ɹ���");
    }

    public static void save() {
        System.out.print("�������");
        Scanner scan = new Scanner(System.in);
        double money = scan.nextDouble();
        if (money < 0) {
            System.out.println("�������");
            return;
        } else {
            account.getSavingsAccount().setBalance(account.getSavingsAccount().getBalance() + money);
            System.out.println("����ɹ���");
        }
    }

    public static void withdraw() {
        System.out.print("����ȡ���");
        Scanner scan = new Scanner(System.in);
        double money = scan.nextDouble();
        if (money > account.getSavingsAccount().getBalance() || money < 0) {
            System.out.println("������������");
            return;
        } else {
            account.getSavingsAccount().setBalance(account.getSavingsAccount().getBalance() - money);
            System.out.println("ȡ��ɹ���");
        }
    }

    public static void comsume() {
        System.out.print("�������ѽ�");
        Scanner scan = new Scanner(System.in);
        double money = scan.nextDouble();
        if (money < 0) {
            System.out.println("�������");
            return;
        } else {
            account.getCheckingAccount().setBalance(account.getCheckingAccount().getBalance() + money);
            System.out.println("֧���ɹ���");
        }
    }

    public static void repay() {
        System.out.print("���뻹���");
        Scanner scan = new Scanner(System.in);
        double money = scan.nextDouble();
        if (money > account.getCheckingAccount().getBalance() || money < 0) {
            System.out.println("����Ƿ��������벻��ȷ��");
            return;
        } else {
            account.getCheckingAccount().setBalance(account.getCheckingAccount().getBalance() - money);
            System.out.println("����ɹ���");
        }
    }

    public static void settle() {
        double money = account.getCheckingAccount().getServiceCharge() * account.getCheckingAccount().getBalance();
        System.out.println("����ѣ�" + money);
        account.getCheckingAccount().assessServiceCharge();
        double money2 = account.getSavingsAccount().getInterestRate() * account.getSavingsAccount().getBalance();
        System.out.println("��Ϣ��" + money2);
        account.getSavingsAccount().payInterest();
    }

    public static void balance() {
        System.out.println("���ÿ�������" + account.getCheckingAccount().getBalance());
        System.out.println("�洢����" + account.getSavingsAccount().getBalance());
    }
}

