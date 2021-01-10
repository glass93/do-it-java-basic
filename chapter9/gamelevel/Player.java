package gamelevel;

public class Player {
	private PlayerLevel level;			// Player�� ������ level ���� ����
	
	public Player() {
		level = new BeginnerLevel();		// ����Ʈ ������. ó�� �����Ǹ� BeginnerLevel�� �����ϸ� ���� �޽��� ���
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {			// ���� ���� �޼���. ���� �ڽ��� level�� �Ű������� ���� level�� �����ϰ� ���� �޽��� ���
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);					// PlayerLevel�� ���ø� �޼��� go() ȣ��
	}
}
