package work1;

public class Bankdriver {
	 private static Bankchoose bchoose = null;

	    public static void main(String[] args) {
	        int choose = bchoose.menu();
	        if (choose != 1) {
	            System.out.println("请先开户！");
	            choose = 1;
	        }
	        while (choose != 8) {
	            switch (choose) {
	            case 1:
	                int choose2 = bchoose.menu2();
	                switch (choose2) {
	                case 1:
	                	bchoose.createCheckingAccount();
	                    break;
	                case 2:
	                	bchoose.createSavingsAccount();
	                    break;
	                default:
	                    System.out.println("输入有误请重试！");
	                    break;
	                }
	                break;
	            case 2:
	            	bchoose.save();
	                break;
	            case 3:
	            	bchoose.withdraw();
	                break;
	            case 4:
	            	bchoose.comsume();
	                break;
	            case 5:
	            	bchoose.repay();
	                break;
	            case 6:
	            	bchoose.settle();
	                break;
	            case 7:
	            	bchoose.balance();
	                break;
	            default:
	                System.out.println("输入有误请重试！");
	                break;
	            }
	            choose = bchoose.menu();
	        }
	    }
}

