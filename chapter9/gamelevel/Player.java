package gamelevel;

public class Player {
	private PlayerLevel level;			// Player가 가지는 level 변수 선언
	
	public Player() {
		level = new BeginnerLevel();		// 디폴트 생성자. 처음 생성되면 BeginnerLevel로 시작하며 레벨 메시지 출력
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {			// 레벨 변경 메서드. 현재 자신의 level을 매개변수로 받은 level로 변경하고 레벨 메시지 출력
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);					// PlayerLevel의 템플릿 메서드 go() 호출
	}
}
