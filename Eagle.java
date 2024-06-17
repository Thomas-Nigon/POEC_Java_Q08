public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "glides into the air.";
    }
    public int flyUp(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 200);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    public int flyDown(int meters){
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
    }
 return this.altitude;
}

    public void land(){
        if (this.altitude == 1 && this.flying) {
            this.flying = false;
            System.out.printf("%s lands.%n", this.getName());
        }else {
            System.out.printf("%s can't land.%n", this.getName());}
    }

    public void fly(){{
        if (!this.flying) {
            this.flying = true;
            System.out.printf("%s takes off.%n", this.getName());
        }
    }


}
}
