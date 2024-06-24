
public class CurveEnemy extends Enemy{
	public CurveEnemy(double x, double y, double vx, double vy) {
		super (x,y,vx,vy);
}
	public void move() {
	if (x<GameWorld.player.x) {
		//自分がプレイヤーより左にいたら
		x++; //左に移動する
	}
	}
}
