package access;

// 캡슐화
// ㄴ 속성(데이터) 숨기기
//    - 모든 데이터는 메서드를 통해서 접근해야 한다
// ㄴ 기능(메서드) 숨기기
//    - 내부에서만 사용하는 기능은 숨겨야 한다
public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // 입금
    public void deposit(int amount) {
        if(isAmountValid(amount)){
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // 출금
    public void withdraw(int amount) {
        if(isAmountValid(amount) && (balance - amount >= 0)) {
            balance -= amount;
        }else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // 잔액 확인
    public int getBalance(){
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0 보다 커야 함
        return amount > 0;
    }
}
