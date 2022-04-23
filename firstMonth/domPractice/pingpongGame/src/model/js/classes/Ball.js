class Ball {
    constructor(x, y, radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.speedX = 3;
        this.speedY = 0;
        this.kind = 'circle';
        this.direction = 1;
    }
    move() {
        this.x += this.speedX * this.direction;
        this.y += this.speedY;
    }
    collision(bar) { }
}
export default Ball;
