package controller;

import java.util.Scanner;

import model.GsDAO;
import model.GsDTO;
import model.MbDTO;

public class GsController {
	Scanner sc = new Scanner(System.in);

	// GsDAO로 id 전달
	public void insert(MbDTO dto) {
		new GsDAO().id_check(dto);
	}
	
	// id에 name이 존재하는지 검사
	public void nameCheck(GsDTO dto) {
		if (dto.getName()==null) {
			System.out.print("캐릭터 명을 생성해주세요 >>");
			String name = sc.next();
			dto.setName(name);
			GsDTO check = (new GsDAO().id_generate(dto));
			if (check.getCnt()>0) {
				System.out.println("캐릭터가 생성되었습니다.");
				// storyCheck 필요
				// Main 실행창에서 매개변수 받아서 시작
				new PmController().play(dto);
			} else {
				System.out.println("캐릭터 생성에 실패했습니다.");
			}
		} else {
			// storyCheck 필요
			// Main 실행창에서 매개변수 받아서 시작
			new PmController().play(dto);
		}
	}
	
}
