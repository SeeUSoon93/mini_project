package controller;

import java.util.Scanner;

import model.GsDTO;
import model.PsDAO;
import model.PsDTO;
import model.StoryDTO;

public class PsController {
	Scanner sc = new Scanner(System.in);
	StoryDTO story1 = new StoryDTO("서브이벤트 1", "CCTV 사각지대에서 주운 돈가방", "[1] 경찰서로 가져다 준다", "[2] 그냥 쓴다", "", "");
	StoryDTO story2 = new StoryDTO("서브이벤트 2", "일제강점기 시대, 둘 중 하나를 선택해야한다면?", "[1] 일본어 못 알아먹고 매일 일본 군인들한테 맞기",
			"[2] 일본 군인들한테 밥 차려주면서 일본어 배우기", "", "");
	StoryDTO story3 = new StoryDTO("서브이벤트 3", "백만 유튜버인 본인, 먹뱉을 걸리게 되고 마는데 ...  ", "[1] 검은배경에 사과영상 찍고 5개월간 유튜브 쉬기",
			"[2] 논란 무시하고 준비해논 영상 업로드하기", "", "");
	StoryDTO story4 = new StoryDTO("메인이벤트 1", "마녀를 만나서 잡히게 된 당신, 당신의 선택은?", "[1] 마녀를 제압하려 하지만 이긴다는 보장은 없다",
			"[2] 마녀에게 내가 아닌 다른 쿠키를 준다고 거래를 한 후, 도망칠 궁리를 하지만 마녀가 제대로 거래를 할 보장은 없다",
			"[3] 마녀에게 풀어주면 가지고 있는 모든 돈을 준다고 한다. 하지만 돈을 준다고 해도 풀어준다는 보장은 없다", "[4] 마녀와 대화를 하고 자신이 살아야 하는 수많은 이유를 말하며 설득하려 하지만 풀어줄 보장은 없다.");
	StoryDTO story5 = new StoryDTO("서브이벤트 4", "늦은 저녁 집으로 돌아가는 길, 가파른 오르막길을 힘겹게 오르는 폐지 줍는 노인", "[1] 도와준다", "[2] 그냥 간다",
			"", "");
	StoryDTO story6 = new StoryDTO("서브이벤트 5", "스카웃 제의 1위 해커가 된 나", "[1] 아무도 모른 채 국가보안을 위해 힘쓰는 화이트 해커",
			"[2] 타인의 시스템을 불법으로 침입하여 시스템을 파괴하지만 20만 팬클럽을 보유한 블랙해커", "", "");
	StoryDTO story7 = new StoryDTO("서브이벤트 6", "트레이너 꿈을 가지고 있다면", "[1] 아무리 운동해도 근육은 안보이기", "[2] 스테로이드 주사 맞고 몸짱되기", "",
			"");
	StoryDTO story8 = new StoryDTO("메인이벤트 2", "마녀에게 잡혀있는 당신에게 가장 큰 시련은 무엇인가?", "[1] 마녀가 팔과 다리를 모두 부서트린다",
			"[2] 마녀가 당신을 바보로 만들어 지능이 5살이 된다", "[3] 마녀가 당신이 가지고 있는 재산을 모두에게 나눠준다",
			"[4] 마녀의 세상 어느 곳에도 자신을 좋아하는 사람이 단 한명도 없게 만든다");
	StoryDTO story9 = new StoryDTO("서브이벤트 7", "나라면?", "[1] 그냥 살기", "[2] 준비를 마치고 나오면 번호를 따이거나 캐스팅 당해서 약속에 한시간 이상 늦기", "",
			"");
	StoryDTO story10 = new StoryDTO("서브이벤트 8", "위조지폐를 사용하고 붙잡히지 않는 확신이 있다면", "[1] 사용을 안한다", "[2] 사용을 한다", "", "");
	StoryDTO story11 = new StoryDTO("서브이벤트 9", "세상은", "[1] 성선설", "[2] 성악설", "", "");
	StoryDTO story12 = new StoryDTO("메인이벤트 3",
			"마녀에게 탈출한 당신은 한가지 물약을 먹을 수 있게 된다면 먹을 물약은?, 당신에게 한가지 초능력이 생기게 되는데 당신이 선택할 초능력은?",
			"[1] 염력", "[2] 천리안 ", "[3] 예지력", "[4] 마인드컨트롤");
	StoryDTO story13 = new StoryDTO("", "", "", "", "", "");

	StoryDTO event[] = { story1, story2, story3, story4, story5, story6, story7, story8, story9, story10, story11,
			story12, story13 };
	// 힘 선
	StoryDTO ending1 = new StoryDTO("엔딩1", "[제 2의 식빵쿠키]", "", "", "", "");
	// 힘 악
	StoryDTO ending2 = new StoryDTO("엔딩2", "[호랑이파 행동대장쿠키]", "", "", "", "");
	// 지능 선
	StoryDTO ending3 = new StoryDTO("엔딩3", "[스마트인재개발원 1등 출신 개발쿠키]", "", "", "", "");
	// 지능 악
	StoryDTO ending4 = new StoryDTO("엔딩4", "[세상을 파괴하고싶은 과학쿠키]", "", "", "", "");
	// 재력 선
	StoryDTO ending5 = new StoryDTO("엔딩5", "[자수성가형 아랍 부자쿠키]", "", "", "", "");
	// 재력 악
	StoryDTO ending6 = new StoryDTO("엔딩6", "[예고 없이 훔쳐가는 괴도쿠키]", "", "", "", "");
	// 매력 선
	StoryDTO ending7 = new StoryDTO("엔딩7", "[국민 짝사랑 쿠키배우]", "", "", "", "");
	// 매력 악
	StoryDTO ending8 = new StoryDTO("엔딩8", "[인성 논란이 끊이지 않는 20만 쿠키 유튜버]", "", "", "", "");

	StoryDTO ending[] = { ending1, ending2, ending3, ending4, ending5, ending6, ending7, ending8 };

	int exCount = 0;
	int evCount = 0;
	int result = 1;

	public void ex1(String name) {
		PsDAO dao = new PsDAO();
		dao.ex1(name);

	}

	public void ex2(String name) {
		PsDAO dao = new PsDAO();
		dao.ex2(name);
	}

	public void ex3(String name) {
		PsDAO dao = new PsDAO();
		dao.ex3(name);
	}

	public void ex4(String name) {
		PsDAO dao = new PsDAO();
		dao.ex4(name);
	}

	public PsDTO evCheck(PsDTO dto) {
		PsDAO dao = new PsDAO();
		exCount = dto.getExCount();
		evCount = dto.getStory();
		if (exCount % 2 == 0 && exCount != 0) {
			String title = event[evCount - 1].getTitle();
			String stage = event[evCount - 1].getStage();
			String userChoice1 = event[evCount - 1].getUserChoice1();
			String userChoice2 = event[evCount - 1].getUserChoice2();
			String userChoice3 = event[evCount - 1].getUserChoice3();
			String userChoice4 = event[evCount - 1].getUserChoice4();

			System.out.printf("%s \n", title);
			System.out.println("\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣄⠀⠀⠀⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣿⣿⣿⣷⡀⠀⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⠀⠿⠿⠿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⣶⣦⣤⣌⣛⠛⢋⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⡀⠀⣀⣀⣀⣤⣤⠀⠀⠀⠀⢠⣤⣄⣀⣀⡀⠀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⡀⢀⣀⣀⣀⣀⣀⠀⠀⠀⣀⣀⣀⣀⣀⡀⢀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⡟⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢿⣿⣿⣿⣿⣿⡆⠀⠀⠀⣾⣿⣿⣿⣿⣿⠇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿⣿⣿⣿⣧⠀⠀⣿⣿⣿⣿⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠛⠛⠛⠃⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠘⣿⣿⣿⣿⣿⣇⠀⠀⢀⣿⣿⣿⣿⣿⡟⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⢸⣿⣿⣿⣿⣿⣿⣧⠀⣿⣿⣿⣿⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣧⣤⣤⣤⣤⣤⠀⠀⠸⣿⣿⣿⣿⣿⡄⠀⣾⣿⣿⣿⣿⡿⠀⠀⣿⣿⣿⣿⣿⣧⣤⣤⣤⣤⡀⠀⢸⣿⣿⣿⣿⣿⣿⣿⡆⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⢻⣿⣿⣿⣿⣷⢰⣿⣿⣿⣿⣿⠁⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣏⣉⣉⣉⣉⣁⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⣿⣿⣿⣿⣿⣏⣉⣉⣉⣉⠀⠀⢸⣿⣿⣿⣿⣿⠘⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣿⣿⣿⠀⠈⢿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⡇⠀⠀⢠⣤⣤⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠸⣿⣿⣿⣿⣿⠀⠀⠘⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⡇⠀⠀⣼⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠈⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠁⣠⣤⣭⡙⠛⠻⠿⠿⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣶⣶⣶⠀⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⠀⠈⢿⣿⣿⣿⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⠀⠀⠀⠙⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "");
			System.out.printf("[%s]\n", stage);
			System.out.println("====================== 메뉴 ======================");
			System.out.printf("%s\n%s\n%s\n%s\n", userChoice1, userChoice2, userChoice3, userChoice4);
			if(evCount-1 == 0) {
				new EndingController(".\\img\\ev01.png");
			}
			if(evCount-1 == 1) {
				new EndingController(".\\img\\ev02.png");
			}
			if(evCount-1 == 2) {
				new EndingController(".\\img\\ev03.png");
			}
			if(evCount-1 == 3) {
				new EndingController(".\\img\\ev04.png");
			}
			if(evCount-1 == 4) {
				new EndingController(".\\img\\ev05.png");
			}
			if(evCount-1 == 5) {
				new EndingController(".\\img\\ev06.png");
			}
			if(evCount-1 == 6) {
				new EndingController(".\\img\\ev07.png");
			}
			if(evCount-1 == 7) {
				new EndingController(".\\img\\ev08.png");
			}
			if(evCount-1 == 8) {
				new EndingController(".\\img\\ev09.png");
			}
			if(evCount-1 == 9) {
				new EndingController(".\\img\\ev10.png");
			}
			if(evCount-1 == 10) {
				new EndingController(".\\img\\ev11.png");
			}
			if(evCount-1 == 11) {
				new EndingController(".\\img\\ev12.png");
			}
			
			
			int exSelect = sc.nextInt();

			if (evCount == 0) {

				if (exSelect == 1) {
					dao.ev5(dto.getId());
				} else if (exSelect == 2) {
					dao.ev6(dto.getId());
					dao.ex3(dto.getId());
				}
			}
			if (evCount == 1) {
				if (exSelect == 1) {
					dao.ev5(dto.getId());
				} else if (exSelect == 2) {
					dao.ev6(dto.getId());
					dao.ex2(dto.getId());
				}
			}
			if (evCount == 2) {
				if (exSelect == 1) {
					dao.ev5(dto.getId());
				} else if (exSelect == 2) {
					dao.ev6(dto.getId());
					dao.ex4(dto.getId());
				}
			}
			// 메인 1
			if (evCount == 3) {
				if (exSelect == 1) {
					dao.ev1(dto.getId());

				} else if (exSelect == 2) {
					dao.ev2(dto.getId());

				} else if (exSelect == 3) {
					dao.ev3(dto.getId());

				} else if (exSelect == 4) {
					dao.ev4(dto.getId());
				}
				
			}
			if (evCount == 4) {
				if (exSelect == 1) {
					dao.ev5(dto.getId());
					dao.ex1(dto.getId());
				} else if (exSelect == 2) {
					dao.ev6(dto.getId());
				}
				PsController con = new PsController();
				con.selectOne(dto.getId());
			}
			if (evCount == 5) {
				if (exSelect == 1) {
					dao.ev5(dto.getId());
					dao.ex2(dto.getId());
				} else if (exSelect == 2) {
					dao.ev6(dto.getId());
				}
				
			}
			if (evCount == 6) {
				if (exSelect == 1) {
					dao.ev5(dto.getId());
				} else if (exSelect == 2) {
					dao.ev6(dto.getId());
					dao.ex1(dto.getId());
				}
			}
			// 메인2
			if (evCount == 7) {
				if (exSelect == 1) {
					dao.ev1(dto.getId());

				} else if (exSelect == 2) {
					dao.ev2(dto.getId());

				} else if (exSelect == 3) {
					dao.ev3(dto.getId());

				} else if (exSelect == 4) {
					dao.ev4(dto.getId());
				}
			}
			if (evCount == 8) {
				if (exSelect == 1) {
					dao.ev5(dto.getId());
				} else if (exSelect == 2) {
					dao.ev6(dto.getId());
					dao.ex4(dto.getId());
				}
				PsController con = new PsController();
				con.selectOne(dto.getId());
			}
			if (evCount == 9) {
				if (exSelect == 1) {
					dao.ev5(dto.getId());
				} else if (exSelect == 2) {
					dao.ev6(dto.getId());
					dao.ex3(dto.getId());
				}
			}
			if (evCount == 10) {
				if (exSelect == 1) {
					dao.ev5(dto.getId());
				} else if (exSelect == 2) {
					dao.ev6(dto.getId());
				}
			}
			// 메인3
			if (evCount == 11) {
				if (exSelect == 1) {
					dao.ev5(dto.getId());
				} else if (exSelect == 2) {
					dao.ev6(dto.getId());
				}
			}
			

		}
		return new PsDTO(dto.getId(), exCount, evCount);

	}

	public void ending(String name) {
		
		MusicController bgm = new MusicController();
		bgm.endingBGM();
		
		PsController con = new PsController();
		con.selectOne(name);
		
		String title = null;
		String stage = null;
		int check = new PsDAO().endingCheck(name);
		if (check == 1) {
			title = ending[0].getTitle();
			stage = ending[0].getStage();
		} else if (check == -1) {
			title = ending[1].getTitle();
			stage = ending[1].getStage();
		} else if (check == 2) {
			title = ending[2].getTitle();
			stage = ending[2].getStage();
		} else if (check == -2) {
			title = ending[3].getTitle();
			stage = ending[3].getStage();
		} else if (check == 3) {
			title = ending[4].getTitle();
			stage = ending[4].getStage();
		} else if (check == -3) {
			title = ending[5].getTitle();
			stage = ending[5].getStage();
		} else if (check == 4) {
			title = ending[6].getTitle();
			stage = ending[6].getStage();
		} else if (check == -4) {
			title = ending[7].getTitle();
			stage = ending[7].getStage();
		}
		System.out.print("두근! 두근! 쿠키 구워지는중");
		try {
			// 3초 대기
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// 예외 처리
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.printf("%s\n%s\n", title, stage);
		if (check == 1) {
			new EndingController(".\\img\\0.jpg");	
		} else if (check == -1) {
			new EndingController(".\\img\\1.jpg");
		} else if (check == 2) {
			new EndingController(".\\img\\2.jpg");
		} else if (check == -2) {
			new EndingController(".\\img\\3.jpg");
		} else if (check == 3) {
			new EndingController(".\\img\\4.jpg");
		} else if (check == -3) {
			new EndingController(".\\img\\5.jpg");
		} else if (check == 4) {
			new EndingController(".\\img\\6.jpg");
		} else if (check == -4) {
			new EndingController(".\\img\\7.jpg");
		}
	}

	public void selectOne(String id) {
		PsDAO dao = new PsDAO();
		String data = dao.selectOne(id);
		if (data.equals("")) {
			System.out.println("");
		} else {
			System.out.println(data);
		}

	}

}
