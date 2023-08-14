package controller;

import model.MbDAO;
import model.MbDTO;

public class MbController {

	// id_check
	public void id_check(MbDTO dto) {
		MbDAO dao = new MbDAO();
		
	}
	
	// insert
	public void insert(MbDTO dto) {
		MbDAO dao = new MbDAO();
		int id_check = dao.id_check(dto);
		if (id_check<1) {
			System.out.println("사용 가능한 ID입니다.");
			int cnt = dao.insert(dto);
			if (cnt > 0) {
				System.out.println("회원가입이 완료되었습니다.");
			} else {
				System.out.println("회원가입에 실패했습니다. 다시 시도하세요.");
			}
		} else {
			System.out.println("중복된 ID입니다. 다른 ID를 입력해주세요.");
		}

	}
	
	// login
	public void login(MbDTO dto) {
		MbDAO dao = new MbDAO();
		String data = dao.login(dto);

		if (data.equals("")) {
			System.out.println("로그인 실패!");
		} else {
			System.out.println(data + "님 환영합니다!");
			new GsController().insert(dto);
		}
	}
	
	public void createChar() {
		System.out.println();
	}

}
