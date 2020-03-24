package member.controller;

import java.util.Scanner;

import member.model.vo.Member;
//import member.view.MemberMenu;

public class MemberManager {
	private static Member[] m = new Member[2];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		for(int i = 0; i < m.length; i++) {
			System.out.print("ID : ");
			String id = sc.nextLine();
			System.out.print("Password : ");
			String pwd = sc.nextLine();
			System.out.print("name : ");
			String name = sc.nextLine();
			System.out.print("age : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("gender : ");
			char gender = sc.nextLine().charAt(0);
			System.out.print("email : ");
			String email = sc.nextLine();
			
			m[i] = new Member(id, pwd, name, age, gender, email);
			ctn++;
			
		}
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
	}
	
	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equalsIgnoreCase(id)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("검색할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
	}
	
	public void searchName() {
		System.out.print("검색할 이름을 입력하세요 : ");
		String name = sc.nextLine();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName().equalsIgnoreCase(name)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("검색할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일을 입력하세요 : ");
		String email = sc.nextLine();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail().equalsIgnoreCase(email)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("삭제할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
	}
	
	public void updatePwd() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equalsIgnoreCase(id)) {
				System.out.print("변경할 비밀번호 : ");
				m[i].setUserPwd(sc.nextLine());
				System.out.println("패스워드 수정이 완료되었습니다.");
				break;
			} else {
				System.out.println("검색할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
	}
	
	public void updateName() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equalsIgnoreCase(id)) {
				System.out.print("변경할 이름 : ");
				m[i].setUserName(sc.nextLine());
				System.out.println("이름 수정이 완료되었습니다.");
				break;
			} else {
				System.out.println("검색할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
	}
	
	public void updateEmail() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equalsIgnoreCase(id)) {
				System.out.print("변경할 이메일 : ");
				m[i].setEmail(sc.nextLine());
				System.out.println("이메일 수정이 완료되었습니다.");
				break;
			} else {
				System.out.println("검색할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
	}
	
	public void deleteOne() {
		System.out.print("탈퇴할 회원의 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equalsIgnoreCase(id)) {
				m[i+1] = m[i];
				break;
			} else {
				System.out.println("삭제할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
	}
	
	public void deleteAll() {
		for(int i = 0; i < ctn; i++) {
			m[i].setUserId(null);
			m[i].setUserPwd(null);
			m[i].setUserName(null);
			m[i].setAge(0);
			m[i].setGender(' ');
			m[i].setEmail(null);
		}
		ctn = 0;
		System.out.println("모든 회원의 정보가 삭제되었습니다.");
	}
	
	public void printAllMember() {
		if(ctn > 0) {
			for(int i = 0; i < ctn; i++) {
				System.out.println(m[i].getUserId() + ", " + m[i].getUserPwd() + ", " + m[i].getUserName() + ", " + m[i].getAge() + ", " + m[i].getGender() + ", " + m[i].getEmail());
			}
		} else {
			System.out.println("회원이 없습니다.");
		}
		
	}
	
	public void printOne(Member m) {
		System.out.println(m.getUserId());
		System.out.println(m.getUserPwd());
		System.out.println(m.getUserName());
		System.out.println(m.getAge());
		System.out.println(m.getGender());
		System.out.println(m.getEmail());

	}
	
	
	
}
