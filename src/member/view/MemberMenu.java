package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	MemberManager mm = new MemberManager();
	
	int menu = 0;
	
	public MemberMenu() {}
	
	public void mainMenu() {
		
		
		do {
			System.out.println("========== 회원 관리 메뉴 ==========");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 종료");
			System.out.println("=================================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: mm.insertMember(); break;
			case 2: searchMemberMenu(); mainMenu(); break;
			case 3: updateMemberMenu(); break;
			case 4: deleteMemberMenu(); break;
			case 5: mm.printAllMember(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("번호를 잘못 누르셨습니다. 다시 입력하세요."); break;
			}
			
		} while(menu != 9);
		
	}
	
	public void searchMemberMenu() {
		
		do {
			System.out.println("========== 회원 정보 검색 ==========");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인 메뉴로");
			System.out.println("=================================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: mm.searchId(); mainMenu(); break;
			case 2: mm.searchName(); mainMenu(); break;
			case 3: mm.searchEmail(); mainMenu(); break;
			case 9: System.out.println("메인메뉴로 이동합니다."); mainMenu(); return;
			default: System.out.println("번호를 잘못 누르셨습니다. 다시 입력하세요."); break;
			}
			
		} while(menu != 9);
		
		
	}
	
	
	public void updateMemberMenu() {
		
		do {
			System.out.println("========== 회원 정보 수정 ==========");
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인 메뉴로");
			System.out.println("=================================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: mm.updatePwd(); mainMenu(); break;
			case 2: mm.updateName(); mainMenu(); break;
			case 3: mm.updateEmail(); mainMenu(); break;
			case 9: System.out.println("메인메뉴로 이동합니다."); mainMenu(); return;
			default: System.out.println("번호를 잘못 누르셨습니다. 다시 입력하세요."); break;
			}
			
		} while(menu != 9);
		
		
	}
	
	
	public void deleteMemberMenu() {

		do {
			System.out.println("========== 회원 정보 삭제 ==========");
			System.out.println("1. 회원 삭제");
			System.out.println("2. 전체 회원 삭제");
			System.out.println("9. 메인 메뉴로");
			System.out.println("=================================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: mm.deleteOne(); break;
			case 2: mm.deleteAll(); break;
			case 9: System.out.println("메인메뉴로 이동합니다."); mainMenu(); return;
			default: System.out.println("번호를 잘못 누르셨습니다. 다시 입력하세요."); break;
			}
			
		} while(menu != 9);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
