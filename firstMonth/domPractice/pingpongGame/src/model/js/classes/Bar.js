class Bar {
    constructor(x, y, width, height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.kind = 'rectangle';
        this.speed = 10;
    }
    down(event) {
        event.preventDefault();
        this.y += this.speed;
    }
    up(event) {
        event.preventDefault();
        this.y -= this.speed;
    }
    toString() {
        return `x: ${this.x} y: ${this.y}`;
    }
}
export default Bar;
